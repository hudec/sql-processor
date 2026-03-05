# SQL Processor – Copilot Instructions

## What this project is

SQL Processor (SQLP) is an ANTLR-based SQL generation framework. It transforms POJO inputs + META SQL statements into parameterized ANSI SQL, executes them via JDBC or Spring JDBC, and maps results back to POJOs using reflection – without ORM or manual JDBC plumbing. This is called a *Data Driven Query*.

## Build & compile

```bash
# Always use mvn25 (Java 25), not mvn
mvn25 compile
mvn25 test-compile
mvn25 package -DskipTests
```

## Running tests

Tests require a live database configured via `test.properties` (DB_TYPE, db.url, etc.). They are not run in CI without a database profile.

```bash
# Run tests for a specific module with a DB profile (e.g. hsqldb)
mvn25 test -pl sql-processor -Phsqldb

# Run a single test class
mvn25 test -pl sql-processor -Phsqldb -Dtest=TestBasic

# Run a single test method
mvn25 test -pl sql-processor -Phsqldb -Dtest=TestBasic#testAnsiBasic
```

## Module structure

| Module | Purpose |
|--------|---------|
| `sql-processor` | Core engine + JDBC stack. ANTLR grammar, `SqlQueryEngine`, `SqlCrudEngine`, `SqlProcedureEngine`, `SqlProcessorLoader` |
| `sql-processor-spring` | Spring JDBC integration (`SpringSimpleSession`, `SpringEngineFactory`) |
| `sql-processor-beans` | Apache Commons BeanUtils plugin (`CommonsBeanUtilsPlugin`) |
| `sql-processor-archetypes` | Maven archetypes for JDBC and Spring starter projects |
| `sql-samples/` | Feature demonstration samples (JDBC, Spring, CRUD, DAO patterns) |
| `simple-samples/` | Database-specific samples (H2, HSQLDB, MySQL, MariaDB, PostgreSQL, Oracle) |

## META SQL – the core artifact

SQL statements live in `.meta` files (e.g. `sql-processor/src/test/resources/jdbc.meta`, `simple-samples/*/src/main/resources/statements.meta`). Each entry has a name, type tag, and body:

```
STATEMENT_NAME(QRY)=          -- query
  select %p.ID @id, %p.NAME_FIRST @name.first
  from %%PERSON p
  {= where
    {& %p.ID = :id }
    {& %p.NAME_LAST like :name.last }
  }
;

STATEMENT_NAME(OUT)=          -- optional explicit output mapping
  id$id(type=Long) first$name.first last$name.last
;

INSERT_PERSON(CRUD)=          -- CRUD statement
  insert into %%PERSON (%ID, %NAME_FIRST) {= values (:id(idgen=SEQ1), :name.first) }
;
```

**Key META SQL syntax:**
- `%%TABLE` – table name placeholder (resolved per DB_TYPE)
- `%alias.COLUMN` – column reference with alias
- `:paramName` – input parameter binding (POJO field via reflection)
- `@fieldName` – inline output column→field mapping
- `{= ... }` – always-included block
- `{& ... }` / `{| ... }` – conditional AND / OR block (included only if params are non-null/non-empty)
- `{? condition | clause }` – conditional clause
- `(type=Long)`, `(idgen=SEQ1)`, `(id)` – modifiers on bindings
- `OPT`, `IOPT`, `BOPT` – string/integer/boolean options
- `(HSQLDB)`, `(ORACLE)` etc. – DB-type-specific overrides

## Core API pattern

```java
// 1. Load META SQL from file(s)
StringBuilder meta = SqlFilesLoader.getStatements(MyClass.class, "statements.meta");

// 2. Create loader (links types, plugins, db-type filter)
SqlProcessorLoader loader = new SqlProcessorLoader(meta, JdbcTypeFactory.getInstance(),
        SimpleSqlPluginFactory.getInstance(), dbType, null, customTypes, "ENGINE_NAME");

// 3. Get typed engine
SqlQueryEngine queryEngine = (SqlQueryEngine) loader.getEngine("ENGINE_NAME", SqlProcessorLoader.EngineType.Query);
SqlCrudEngine crudEngine   = (SqlCrudEngine)  loader.getEngine("ENGINE_NAME", SqlProcessorLoader.EngineType.Crud);

// 4. Execute (session wraps a java.sql.Connection)
List<Person> results = queryEngine.query(session, Person.class, inputForm, sqlControl);
int count = crudEngine.insert(session, entity, sqlControl);

// Spring variant
SpringSimpleSession session = new SpringSimpleSession(jdbcTemplate);
```

## Test infrastructure

- All tests extend `TestDatabase` (in `sql-processor/src/test/java/org/sqlproc/engine/impl/`)
- `TestDatabase` extends DBUnit's `DatabaseTestCase` – each test loads its DBUnit XML fixture via `getDataSetFile(dbType)`
- DBUnit fixtures are in `src/test/resources/dbunit/`
- `assertEquals`, `assertNotNull` etc. come from JUnit 4's `TestCase` (inherited through DBUnit) – **not** from `org.junit.jupiter.api.Assertions` (which is why static imports are only added when needed)
- `getSqlEngine(name)` / `getCrudEngine(name)` / `getProcedureEngine(name)` are helpers on `TestDatabase`
- Use `sqlEngine.getSql(input, control, order)` to inspect the generated SQL before executing

## Key conventions

- **DB_TYPE string** drives both META SQL variant selection (e.g. `SEQ1(OPT,HSQLDB)=...`) and DBUnit datatype factories. Common values: `hsqldb`, `h2`, `oracle`, `postgresql`, `mysql`, `mssql`, `db2`.
- **POJO fields** are accessed by reflection using dot-notation: `:name.first` maps to `pojo.getName().getFirst()`.
- **Enums** used as filter values must implement `SqlTypeEnumerator` or be registered as custom types.
- **`SqlControl`** carries runtime overrides: max rows, offset, order, cache key, etc. Pass `null` to use defaults.
- **`SqlOrder`** controls ORDER BY: `SqlQueryEngine.NO_ORDER`, or `sqlEngine.getOrder("id", SqlOrder.ASC)`.
- META SQL name lookup is case-insensitive but conventionally UPPER_SNAKE_CASE.
- The `sql-processor-beans` module is optional – include it to use Apache Commons BeanUtils for property access instead of the built-in reflection plugin.
- Version property is `3.9.1-SNAPSHOT`; use `mvn25` for all Maven commands.
