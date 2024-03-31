/**
 * The public part of the <b>SQL Processor</b> implementation.
 * The most important classes are {@link org.sqlproc.engine.SqlQueryEngine} and {@link org.sqlproc.engine.SqlCrudEngine}.
 * There are also some helper classes and basic interfaces.
 * 
 * <p>
 * <b>SQL Processor</b> is <i>Data Driven Query Engine</i>. It's able to dynamically generate ANSI SQL query 
 * or statement based on search data provided by an end user or an application. This is done in the runtime, without 
 * any plumbing code required.
 * 
 * <p>
 * SQL Processor has 3 basic inputs:
 * <ul>
 * <li>A <b>META SQL query or statement</b>. META SQL is an ANSI SQL extension based on ANTLR grammar. 
 * For example the META SQL query is<br> 
 * <code>select p.ID id, p.NAME name from PERSON p {= where {&amp; p.id=:id} {&amp; UPPER(name)=:+p.name}}</code>
 * <li><b>Input values</b> provided by an end user. These data are collected in a search form, a standard 
 * POJO object, which can be created in a presentation layer of a web application.
 * <li>A <b>result class</b> definition, which is used to carry output data from an SQL query execution. This
 * class is a standard POJO object, instances of which are created in the SQL Processor without any plumbing
 * code. It can work as a transport object from a persistence to a presentation layer of a web application. 
 * </ul>
 *
 * Next, the SQL Processor has one output - the list of result class instances.
 * 
 * <p>
 * For the META SQL query described above the generated ANSI SQL query can be
 * <ul>
 * <li><code>select p.ID id, p.NAME name from PERSON p</code> in the case there are no values
 * in a search form or this search form is null.
 * <li><code>select p.ID id, p.NAME name from PERSON p where id=?</code> in the case there's 
 * a not null value for <code>id</code> attribute in a search form.
 * </ul>
 *
 * <p>
 * In the process of data collection from a search form it's used Reflection API. The same API is used in the process
 * of seeding instances of result class with the SQL query execution output. 
 *
 * <p>
 * The package <code>org.sqlproc.engine.impl</code> contains non public part of the <b>SQL Processor</b> implementation. 
 * This part of the code can be changed any time to improve the SQL Processor capabilities.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
package org.sqlproc.engine;