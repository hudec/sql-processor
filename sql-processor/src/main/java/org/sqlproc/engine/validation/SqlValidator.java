package org.sqlproc.engine.validation;

import org.sqlproc.engine.SqlCrudEngine;

/**
 * The vehicle interface definition, which can be used to validate input values in INSERT or UPDATE statements. The SQL
 * Processor knows, which input values have to be validated in CRUD statements. For this purpose the injected validator
 * is invoked. On the other side, the validator knows, how to validate the input values.
 * 
 * <p>
 * The implementation can be based for example on the Hibernate library. The working sample implementation can be seen
 * at <a
 * href="https://github.com/hudec/sql-processor/blob/master/sql-processor/src/test/java/org/sqlproc/engine/validation/
 * SampleValidator.java">Sample validator</a>. This validator in based on JSR 303. The annotated POJO (=dynamic input
 * forms) can be seen at <a href=
 * "https://github.com/hudec/sql-processor/blob/master/sql-processor/src/test/java/org/sqlproc/engine/model/PersonBase.java"
 * >Annotated Person POJO</a>. In the case the validation is failed, the {@link SqlValidationException} is thrown.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlValidator {

    /**
     * The SqlValidator visitor method called from inside the main execution methods in {@link SqlCrudEngine}. This is
     * the first step to establish the validation context.
     * 
     * @param parentType
     *            the dynamic or static input form type
     * @return the validation context
     */
    <T> SqlValidationContext<T> start(Class<T> parentType);

    /**
     * The SqlValidator visitor method called from inside the main execution methods in {@link SqlCrudEngine}. This is
     * the validation step devoted for one input value.
     * 
     * @param context
     *            the validation context
     * @param parentType
     *            the dynamic or static input form type
     * @param propertyName
     *            the name of the input attribute (in input form)
     * @param value
     *            the input value (= the value of the input attribute)
     */
    <T> void validate(SqlValidationContext<T> context, Class<T> parentType, String propertyName, Object value);

    /**
     * The SqlValidator visitor method called from inside the main execution methods in {@link SqlCrudEngine}. This is
     * the final step to return the overall validation result.
     * 
     * @param context
     *            the validation context
     * @return overall validation result. In the case it's not null, the SQL Processor throws
     *         {@link SqlValidationException}.
     */
    <T> SqlValidationResult<?> finish(SqlValidationContext<T> context);
}
