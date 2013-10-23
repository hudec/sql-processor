package org.sqlproc.engine.validation;

public interface SqlValidator {
    <T> void validate(SqlValidationContext<T> context, Class<T> parentType, String propertyName, Object value);

    <T> SqlValidationContext<T> start(Class<T> parentType);

    <T> SqlValidationResult finish(SqlValidationContext<T> context);
}
