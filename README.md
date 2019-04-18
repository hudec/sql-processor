SQL Processor - Data Driven Queries - http://sql-processor.eu/

The SQL Processor (SQLP) is an engine producing the ANSI SQL statements and providing their execution without the necessity to write Java plumbing code related to the ORM or JDBC API. The input to the SQL Processor is

* a search form (or a question form or the input values), which is just a POJO. Typically this form is seeded by an end user in a presentation layer of a web application.
* a META SQL query or statement, which is an enhanced ANSI SQL statement. This enhancement is defined in ANTLR based grammar. All the META SQL statements are defined in the meta statements file.
* an output mapping rule, which is a mapping prescription from an SQL query result to the Java output classes values. This prescription syntax is again defined in ANTLR based grammar. All the mapping rules are also defined in the meta statements file. 

Based on the inputs the final SQL query/statement is generated. The parameters are bounded and finally this query/statement is executed. This process is known as a Data Driven Query. The binding of the input values is done using the Reflection API, without any Java plumbing code. The output of the SQL Processor is

* a list of result class instances (or data transfer objects or the output values). Each result class instance is created using the Reflection API, again without any Java plumbing code. 

The SQL Processor Eclipse Plugin (SQLEP) enables smart edition of the SQL Processor (SQLP) artefacts, POJO and DAO modelling and SQLP artefacts generation based on DB model (including all META SQL statements, POJO and DAO Java code).

Project content
- sql-processor - the SQL Processor (SQLP) core and the JDBC stack
- sql-processor-hibernate - the SQL Processor (SQLP) extension, the Hibernate stack
- sql-processor-spring - the SQL Processor (SQLP) extension, the Spring stack
- sql-processor-eclipse - the SQL Processor Eclipse plugin (SQLEP)
- sql-processor-archetypes - the SQL Processor Archetypes
 - sqlproc-archetype-simple-jdbc - the SQLP Archetype for Simple JDBC Application
 - sqlproc-archetype-simple-spring - the SQLP Archetype for Simple Spring Application
- sql-samples - the samples to demonstrate the SQL Processor features
 - simple-jdbc -  the Simple JDBC based Application
 - simple-jdbc-pojo -  the Simple JDBC based Application with generated POJO
 - simple-spring -  the Simple Spring based Application
 - simple-spring-pojo -  the Simple Spring based Application with generated POJO
 - simple-hibernate -  the Simple Hibernate based Application
 - simple-jdbc-crud -  the Advanced JDBC based Application with *generated POJO, DAO and META SQL*
 - simple-jdbc-dao -  the Advanced Spring based Application with *generated POJO, DAO, META SQL, separate impl*
 - catalog-jpa - the working Web Application based on JPA and the Hibernate stack
 - catalog-hibernate - the working Web Application based on the Hibernate stack
 - catalog-spring - the working Web Application based on the Spring stack
- simple-samples - the samples to demonstrate the supported databases
 - simple-db2 - the *DB2* Application with generated POJO, DAO and META SQL
 - simple-hsqldb - the *HSQLDB* Application with generated POJO, DAO and META SQL
 - simple-informix - the *Informix* Application with generated POJO, DAO and META SQL
 - simple-mysql - the *MySQL* Application with generated POJO, DAO and META SQL
 - simple-oracle - the *Oracle* Application with generated POJO, DAO and META SQL
 - simple-postgresql - the *PostgreSQL* Application with generated POJO, DAO and META SQL

