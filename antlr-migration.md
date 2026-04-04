# ANTLR 3.5.3 → 4.13.2 Migration Plan

## Background

The project uses ANTLR 3.5.3 (`org.antlr:antlr`, `org.antlr:antlr-runtime`) with the `antlr3-maven-plugin`. The target is ANTLR 4.13.2.

Two grammar files exist, nearly identical:
- `sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g` — full grammar, builds domain objects via embedded Java actions
- `sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessorLazy.g` — simplified variant, stores statements as raw strings

Four hand-written Java files use ANTLR 3 directly:
- `sql-processor/src/main/java/org/sqlproc/engine/impl/SqlProcessor.java`
- `sql-processor/src/main/java/org/sqlproc/engine/impl/SqlMappingRule.java`
- `sql-processor/src/main/java/org/sqlproc/engine/impl/SqlMetaStatement.java`
- `sql-processor/src/main/java/org/sqlproc/engine/impl/ParserUtils.java`

**Good news:** No tree grammars, no `CommonTree`, no `TreeAdaptor`. The grammar builds domain objects directly through embedded Java actions, which greatly simplifies the migration.

---

## Step 1 — Maven POM changes

### `pom.xml` (root)

Change the ANTLR version property:
```xml
<version.antlr>4.13.2</version.antlr>
```

In `<dependencyManagement>`, remove both ANTLR 3 entries and replace with:
```xml
<!-- ANTLR -->
<dependency>
    <groupId>org.antlr</groupId>
    <artifactId>antlr4-runtime</artifactId>
    <version>${version.antlr}</version>
</dependency>
```

### `sql-processor/pom.xml`

Replace the `antlr3-maven-plugin` with:
```xml
<plugin>
    <groupId>org.antlr</groupId>
    <artifactId>antlr4-maven-plugin</artifactId>
    <version>${version.antlr}</version>
    <executions>
        <execution>
            <goals>
                <goal>antlr4</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

Replace runtime dependencies:
```xml
<!-- ANTLR -->
<dependency>
    <groupId>org.antlr</groupId>
    <artifactId>antlr4-runtime</artifactId>
</dependency>
```

---

## Step 2 — Grammar file changes (both `.g` files)

### 2a — Rename and move

Move grammar files from `src/main/antlr3/` to `src/main/antlr4/org/sqlproc/engine/impl/` and rename to `.g4`. The `antlr4-maven-plugin` scans `src/main/antlr4` by default and will pick them up automatically.

### 2b — Remove `options { greedy=... }` blocks

ANTLR 4 is greedy by default. Strip `(options {greedy=true;} : ...)` wrappers (~14 occurrences across both files), keeping only the inner content.

```antlr
// Before
(options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { ... } )*

// After
(LPAREN (value=IDENT | value=NUMBER) { ... } )*
```

### 2c — Rewrite lexer character ranges

ANTLR 4 uses character set syntax instead of `'a'..'z'` ranges.

```antlr
// Before
IDENT   : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
fragment DIGIT: ('0'..'9');

// After
IDENT   : [a-zA-Z] [a-zA-Z0-9_]*;
fragment DIGIT: [0-9];
```

### 2d — Rewrite comment rules

The hidden channel assignment syntax and non-greedy option changed.

```antlr
// Before
ML_COMMENT : '/*' (options {greedy=false;} : .)*'*/' {$channel=HIDDEN;} ;
SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {$channel=HIDDEN;} ;

// After
ML_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
SL_COMMENT : '//' ~[\n\r]* ('\r'? '\n')? -> channel(HIDDEN) ;
```

### 2e — Replace `scope` declarations *(hardest part)*

ANTLR 4 removed dynamic scopes. The grammar uses `$meta::text`, `$meta::typeFactory`, `$meta::skip`, and `$meta::hasOutputMapping` across many rules (~7 levels deep), as well as `$mapping::typeFactory` and `$mapping::skip`.

**Strategy:** promote scope variables to parser member fields in `@members`. This works because the grammar is not re-entrant — `meta` and `mapping` are each called once per parse.

Add to `@members` in both grammar files:
```java
private StringBuilder _scopeText;
private boolean _scopeHasOutputMapping;
private SqlTypeFactory _scopeTypeFactory;
private boolean _scopeSkip;
```

Then replace all references:

| Old | New |
|---|---|
| `$meta::text` | `_scopeText` |
| `$meta::typeFactory` | `_scopeTypeFactory` |
| `$meta::skip` | `_scopeSkip` |
| `$meta::hasOutputMapping` | `_scopeHasOutputMapping` |
| `$mapping::typeFactory` | `_scopeTypeFactory` |
| `$mapping::skip` | `_scopeSkip` |

Initialize them in the `meta` and `mapping` rules' `@init` blocks (replacing the existing `scope` init code).

### 2f — Remove `getErrorMessage` / `reportError` overrides from `@members`

These ANTLR 3 override hooks no longer exist in ANTLR 4. Remove both method bodies from the grammar's `@members` and `@lexer::members` blocks.

Error collection moves to a custom `ANTLRErrorListener` registered at parse time (see Step 4). Keep the `List<ErrorMsg> errors` field and `getErrors()` method in `@members`, and add an `addError(ErrorMsg e)` helper for the listener to call.

### 2g — Fix `REST` token negated character class

ANTLR 4 cannot negate named tokens — only character sets.

```antlr
// Before (ANTLR 3) — negates named token references
REST: ~(COLON | SEMICOLON | DOLLAR | ...);

// After (ANTLR 4) — must use character literals
REST: ~[:;$,\-+(){ }?!&|#@^=<>%];
```

Map each referenced token name to its literal character carefully.

### 2h — Verify `String[\]` rule parameter syntax

The entry rule uses `String[\]` to escape `]` in the parameter list. Test whether ANTLR 4 still requires this escaping. If not, change to plain `String[]`.

---

## Step 3 — Update Java API in hand-written files

### 3a — Import replacements (all four files)

| ANTLR 3 (`org.antlr.runtime.*`) | ANTLR 4 (`org.antlr.v4.runtime.*`) |
|---|---|
| `ANTLRStringStream` | `CharStreams` |
| `CommonTokenStream` | `CommonTokenStream` |
| `RecognitionException` | `RecognitionException` |
| `Token` | `Token` |
| `CommonToken` | `CommonToken` |
| `MismatchedTokenException` | `InputMismatchException` |

### 3b — `SqlProcessor.java`, `SqlMappingRule.java`, `SqlMetaStatement.java`

Update lexer instantiation:
```java
// Before
new SqlProcessorLexer(new ANTLRStringStream(input))

// After
new SqlProcessorLexer(CharStreams.fromString(input))
```

Remove try/catch for `RecognitionException` — ANTLR 4 parsers no longer throw it; errors go through the error listener. Register the custom error listener (see Step 4):

```java
lexer.removeErrorListeners();
parser.removeErrorListeners();
SqlProcessorErrorListener errorListener = new SqlProcessorErrorListener();
lexer.addErrorListener(errorListener);
parser.addErrorListener(errorListener);
```

After parsing, collect errors from the listener rather than from the parser's `getErrors()` method.

### 3c — `ParserUtils.java`

| Old ANTLR 3 access | New ANTLR 4 equivalent |
|---|---|
| `ex.token` | `ex.getOffendingToken()` |
| `ex.index` | `ex.getOffendingToken().getTokenIndex()` |
| `ex.line` | `ex.getOffendingToken().getLine()` |
| `tokenNames[tokenType]` | `vocabulary.getDisplayName(tokenType)` |

Update the `create` method signatures to accept `Vocabulary` instead of `String[]`:
```java
// Before
public static ErrorMsg create(String name, String msg, RecognitionException ex, String[] tokenNames)

// After
public static ErrorMsg create(String name, String msg, RecognitionException ex, Vocabulary vocabulary)
```

---

## Step 4 — Create `SqlProcessorErrorListener.java`

Create a new file `sql-processor/src/main/java/org/sqlproc/engine/impl/SqlProcessorErrorListener.java`:

```java
package org.sqlproc.engine.impl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public class SqlProcessorErrorListener extends BaseErrorListener {

    private final List<ErrorMsg> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add(ParserUtils.create(null, msg, e, recognizer.getVocabulary()));
    }

    public List<ErrorMsg> getErrors() {
        return errors;
    }
}
```

This replaces the `getErrorMessage` / `reportError` overrides that were previously embedded in the grammar's `@members` section.

---

## Risks

| Risk | Severity | Notes |
|---|---|---|
| `scope` replacement | High | ~7 rules reference scope variables; requires careful field-based refactoring across both grammar files |
| `REST` negated character class | Medium | Named-token negation is gone; must map each token name to its literal character — easy to miss one |
| `input.LT(-1)` behaviour | Medium | ANTLR 4's `CommonTokenStream.LT(-1)` skips hidden-channel tokens, same as ANTLR 3, but verify against actual hidden/on-channel token assignments in the migrated grammar |
| Token integer values change | Low | Only a risk if any code uses hard-coded integers — none found in hand-written files |
| `String[\]` parameter syntax | Low | Quick to verify with a standalone test compile |

---

## Recommended migration order

1. **Step 1 (Maven POMs)** — makes the build fail loudly with "grammar not found" rather than silently using stale artifacts
2. **Step 4 (`SqlProcessorErrorListener`)** — no grammar dependency, can be reviewed and tested independently
3. **Step 3c (`ParserUtils`)** — mechanical Java changes, no grammar dependency
4. **Step 2 on `SqlProcessorLazy.g4`** — simpler grammar (no `scope`), use as proof of concept; get `mvn25 generate-sources` passing for this grammar first
5. **Step 2 on `SqlProcessor.g4`** — full grammar migration including `scope` replacement
6. **Steps 3a/b (Java callers)** — update `SqlProcessor.java`, `SqlMappingRule.java`, `SqlMetaStatement.java`
7. **Verify** — `mvn25 generate-sources -pl sql-processor`, then `mvn25 test -pl sql-processor -Phsqldb`
