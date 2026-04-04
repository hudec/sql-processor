# ANTLR 3.5.3 → 4.13.2 Migration

## Status: COMPLETE ✓

All 246 core tests and 242 Spring module tests pass with ANTLR 4.13.2.

---

## What was done

### Maven POM changes

- `pom.xml` (root): Changed `<version.antlr>3.5.3</version.antlr>` → `4.13.2`; replaced `antlr` + `antlr-runtime` dependencies with `antlr4-runtime` in `<dependencyManagement>`
- `sql-processor/pom.xml`: Replaced `antlr3-maven-plugin` with `antlr4-maven-plugin` (goal: `antlr4`); replaced `antlr` + `antlr-runtime` with `antlr4-runtime`
- `sql-processor-beans/pom.xml`: Same plugin/dependency update
- `sql-processor-spring/pom.xml`: Replaced `antlr-runtime` with `antlr4-runtime`

### Grammar files

Moved from `src/main/antlr3/` to `src/main/antlr4/org/sqlproc/engine/impl/` and renamed to `.g4`.

Applied to both `SqlProcessor.g4` and `SqlProcessorLazy.g4`:

| Change | Detail |
|--------|--------|
| `@header` package removed | ANTLR 4 auto-generates `package` from directory; having it in `@header` caused duplicate declarations |
| `@members` → `@parser::members` | ANTLR 4 combined grammars inject `@members` into both Lexer and Parser; `@parser::members` restricts to Parser only |
| `@lexer::members` removed | Caused "redefinition of members action" error; error handling moved to external listener |
| Missing imports added to `@header` | Added `ArrayList`, `Collections`, `List`, `Stack` (needed by parser members code) |
| `options {greedy=...}` removed | ANTLR 4 is greedy by default |
| Character ranges rewritten | `('a'..'z')` → `[a-zA-Z]`, `('0'..'9')` → `[0-9]` |
| Comment rules rewritten | `{$channel=HIDDEN;}` → `-> channel(HIDDEN)`; `(options{greedy=false;}:.)` → `.*?` |
| Dynamic scopes removed | `scope { StringBuilder text; ... }` replaced with `@parser::members` fields: `_scopeText`, `_scopeHasOutputMapping`, `_scopeTypeFactory`, `_scopeSkip` |
| `REST` token negation fixed | ANTLR 4 can't negate named tokens; changed to character literal set: `~[:;$,\-+(){}?!&\|#@^=<>%]` |
| `String[\]` → `List<String>` | ANTLR 4.13.2 passes `\]` through verbatim (does not strip escape); avoided `[]` in rule argument lists entirely by using `List<String>` for `filters` parameter and `java.util.Collections.emptyList()` in the `parse` wrapper rule |
| `text=option[...]` label renamed | Label `text` conflicted with ANTLR 4 built-in `$text` attribute, producing garbled generated code; renamed to `optionCtx` |
| `fragmentType.getText()` → `$fragmentType.getText()` | ANTLR 4 requires `$` prefix for labeled token references in action code |
| `getErrorMessage`/`reportError` removed | These ANTLR 3 override hooks don't exist in ANTLR 4; error handling delegated to `SqlProcessorErrorListener` |

### New file: `SqlProcessorErrorListener.java`

`sql-processor/src/main/java/org/sqlproc/engine/impl/SqlProcessorErrorListener.java` — implements `BaseErrorListener`, collects parse errors into `List<ErrorMsg>`.

### Java caller changes

All four hand-written files updated:

**Import changes (all files):**
- `org.antlr.runtime.*` → `org.antlr.v4.runtime.*`
- `ANTLRStringStream` → `CharStreams` (used as `CharStreams.fromString(...)`)
- `MismatchedTokenException` → `InputMismatchException`
- Added `Vocabulary` import

**`SqlProcessor.java`:**
- Added `Arrays` import; changed `parser.parse2(..., filters)` → `parser.parse2(..., Arrays.asList(filters)).processor` (ANTLR 4 rule methods return `XxxContext`, not the return value directly)
- Removed `try/catch RecognitionException`; registered `SqlProcessorErrorListener` on both lexer and parser; errors collected from listener

**`SqlMappingRule.java`:**
- `parser.mapping(...).sqlMapping` instead of `parser.mapping(...)`
- Error handling via `SqlProcessorErrorListener`

**`SqlMetaStatement.java`:**
- `parser.meta(...).metaStatement` instead of `parser.meta(...)`
- Error handling via `SqlProcessorErrorListener`

**`ParserUtils.java`:**
- `ex.token` → `ex.getOffendingToken()`
- `ex.index` → `ex.getOffendingToken().getTokenIndex()`
- `ex.line` → `ex.getOffendingToken().getLine()`
- `String[] tokenNames` → `Vocabulary vocabulary`; `tokenNames[type]` → `vocabulary.getDisplayName(type)`

---

## Key ANTLR 4 gotchas encountered

1. **`@members` goes to both Lexer and Parser** in combined grammars — use `@parser::members` for parser-only code.

2. **`@header` package duplication** — ANTLR 4 generates `package` automatically from the grammar's source directory; do not include it in `@header`.

3. **`\]` not stripped in rule arg lists** — ANTLR 4.13.2 passes `\]` through verbatim to Java. Avoid `[]` types (e.g., `String[]`) in rule parameter declarations and invocation argument lists; use `List<String>` instead.

4. **Label name conflicts** — Labels named `text` conflict with ANTLR 4's built-in `$text` attribute; choose unambiguous label names.

5. **Rule methods return `XxxContext`** — In ANTLR 4, calling `parser.ruleName(...)` returns `RuleNameContext`, not the declared return value. Access the return value as `.fieldName` on the context.

6. **`$` required for labels in actions** — `$label.getText()` not `label.getText()`.
