# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this project is

SQL Processor (SQLP) is an ANTLR-based SQL generation framework. It transforms POJO inputs + META SQL statements into parameterized ANSI SQL, executes them via JDBC or Spring JDBC, and maps results back to POJOs using reflection – without ORM or manual JDBC plumbing. This is called a *Data Driven Query*.

## Build & compile

Use `mvn25` (the Maven wrapper that runs on JDK 25), not plain `mvn` — plain `mvn` on this machine is on JDK 21 and fails with `release version 25 not supported`:

```bash
mvn25 compile
mvn25 test-compile
mvn25 package -DskipTests
```

## Running tests

Tests require a live database configured via `test.properties`. Use a DB profile:

```bash
# Run all tests for a module
mvn25 test -pl sql-processor -Phsqldb

# Run a single test class
mvn25 test -pl sql-processor -Phsqldb -Dtest=TestBasic

# Run a single test method
mvn25 test -pl sql-processor -Phsqldb -Dtest=TestBasic#testAnsiBasic
```

Available profiles: `hsqldb`, `h2`, `oracle`, `oracle-itests`, `mysql`, `mysql-itests`, `postgresql`, `postgresql-itests`, `mariadb`, `mariadb-itests`, `informix`, `informix-itests`, `mssql`, `mssql-itests`, `db2-itests`.

## Module structure

| Module | Purpose |
|--------|---------|
| `sql-processor` | Core engine + JDBC stack. ANTLR grammar, `SqlQueryEngine`, `SqlCrudEngine`, `SqlProcedureEngine`, `SqlProcessorLoader` |
| `sql-processor-spring` | Spring JDBC integration (`SpringSimpleSession`, `SpringEngineFactory`) |
| `sql-processor-beans` | Optional Apache Commons BeanUtils plugin (`CommonsBeanUtilsPlugin`) for property access instead of built-in reflection |
| `sql-processor-archetypes` | Maven archetypes for JDBC and Spring starter projects |
| `sql-samples/` | Feature demonstration samples (JDBC, Spring, CRUD, DAO patterns) |
| `simple-samples/` | Database-specific samples (H2, HSQLDB, MySQL, MariaDB, PostgreSQL, Oracle) |

## META SQL – the core artifact

SQL statements live in `.meta` files (e.g. `sql-processor/src/test/resources/jdbc.meta`). Each entry has a name, type tag, and body:

```
STATEMENT_NAME(QRY)=
  select %p.ID @id, %p.NAME_FIRST @name.first
  from %%PERSON p
  {= where
    {& %p.ID = :id }
    {& %p.NAME_LAST like :name.last }
  }
;

INSERT_PERSON(CRUD)=
  insert into %%PERSON (%ID, %NAME_FIRST) {= values (:id(idgen=SEQ1), :name.first) }
;
```

**Key META SQL syntax:**
- `%%TABLE` – table name placeholder (resolved per DB_TYPE)
- `%alias.COLUMN` – column reference with alias
- `:paramName` – input parameter binding (POJO field via reflection, dot-notation for nested: `:name.first` → `pojo.getName().getFirst()`)
- `@fieldName` – inline output column→field mapping
- `{= ... }` – always-included block
- `{& ... }` / `{| ... }` – conditional AND / OR block (included only if params are non-null/non-empty)
- `{? condition | clause }` – conditional clause
- `(type=Long)`, `(idgen=SEQ1)`, `(id)` – modifiers on bindings
- `OPT`, `IOPT`, `BOPT` – string/integer/boolean options
- `(HSQLDB)`, `(ORACLE)` etc. – DB-type-specific overrides

## Core API pattern

```java
// 1. Load META SQL
StringBuilder meta = SqlFilesLoader.getStatements(MyClass.class, "statements.meta");

// 2. Create loader
SqlProcessorLoader loader = new SqlProcessorLoader(meta, JdbcTypeFactory.getInstance(),
        SimpleSqlPluginFactory.getInstance(), dbType, null, customTypes, "ENGINE_NAME");

// 3. Get typed engine
SqlQueryEngine queryEngine = (SqlQueryEngine) loader.getEngine("ENGINE_NAME", SqlProcessorLoader.EngineType.Query);
SqlCrudEngine crudEngine   = (SqlCrudEngine)  loader.getEngine("ENGINE_NAME", SqlProcessorLoader.EngineType.Crud);

// 4. Execute
List<Person> results = queryEngine.query(session, Person.class, inputForm, sqlControl);
int count = crudEngine.insert(session, entity, sqlControl);

// Spring variant
SpringSimpleSession session = new SpringSimpleSession(jdbcTemplate);
```

## Test infrastructure

- All tests extend `TestDatabase` (`sql-processor/src/test/java/org/sqlproc/engine/impl/TestDatabase.java`), which extends DBUnit's `DatabaseTestCase`
- Each test loads its DBUnit XML fixture via `getDataSetFile(dbType)`; fixtures are in `src/test/resources/dbunit/`
- Assertions use JUnit 4's `TestCase` inherited through DBUnit – **not** `org.junit.jupiter.api.Assertions`
- Helpers on `TestDatabase`: `getSqlEngine(name)`, `getCrudEngine(name)`, `getProcedureEngine(name)`
- Use `sqlEngine.getSql(input, control, order)` to inspect generated SQL before executing

## Key conventions

- **DB_TYPE string** drives META SQL variant selection and DBUnit datatype factories. Values: `hsqldb`, `h2`, `oracle`, `postgresql`, `mysql`, `mssql`, `db2`
- **Enums** used as filter values must implement `SqlTypeEnumerator` or be registered as custom types
- **`SqlControl`** carries runtime overrides (max rows, offset, order, cache key). Pass `null` for defaults
- **`SqlOrder`**: use `SqlQueryEngine.NO_ORDER` or `sqlEngine.getOrder("id", SqlOrder.ASC)`
- META SQL name lookup is case-insensitive but conventionally UPPER_SNAKE_CASE

## ANTLR grammar

The project uses **ANTLR 4.13.2** (`antlr4-maven-plugin`, `antlr4-runtime`). Two near-identical grammars live at `sql-processor/src/main/antlr4/org/sqlproc/engine/impl/`:
- `SqlProcessor.g4` – full grammar, builds domain objects via embedded Java actions in `@parser::members`
- `SqlProcessorLazy.g4` – simplified variant, stores statements as raw strings

Hand-written ANTLR clients are `SqlProcessor.java`, `SqlMappingRule.java`, `SqlMetaStatement.java`, and `ParserUtils.java`; lexer/parser errors are routed through `SqlProcessorErrorListener.java`. Migration history from ANTLR 3.5.3 is in `antlr-migration.md`.
