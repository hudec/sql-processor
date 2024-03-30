package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import org.sqlproc.engine.validation.SqlValidationContext;
import org.sqlproc.engine.validation.SqlValidationResult;
import org.sqlproc.engine.validation.SqlValidator;
import org.sqlproc.engine.validation.SqlValidatorFactory;

public class SampleValidator implements SqlValidator {

    Validator validator;

    public SampleValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public <T> void validate(SqlValidationContext<T> context, Class<T> parentType, String propertyName, Object value) {
        if (parentType == null || propertyName == null)
            return;
        SampleValidationContext<T> sampleContext = ((SampleValidationContext<T>) context);
        Set<ConstraintViolation<T>> constraintViolations = validator.validateValue(parentType, propertyName, value);
        sampleContext.addConstraintViolations(constraintViolations);
    }

    @Override
    public <T> SqlValidationContext<T> start(Class<T> parentType) {
        return new SampleValidationContext<T>();
    }

    @Override
    public <T> SqlValidationResult<Set<ConstraintViolation<T>>> finish(SqlValidationContext<T> context) {
        SampleValidationContext<T> sampleContext = ((SampleValidationContext<T>) context);
        Set<ConstraintViolation<T>> constraintViolations = sampleContext.getConstraintViolations();
        if (constraintViolations == null || constraintViolations.isEmpty())
            return null;
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (ConstraintViolation<T> cv : constraintViolations) {
            if (first)
                first = false;
            else
                sb.append("\n");
            sb.append(cv.getMessage());
        }
        return new SampleValidationResult<Set<ConstraintViolation<T>>>(constraintViolations, sb.toString());
    }

    public static class SampleValidationContext<T> implements SqlValidationContext<T> {
        Set<ConstraintViolation<T>> constraintViolations;

        public void addConstraintViolations(Set<ConstraintViolation<T>> constraintViolations) {
            if (constraintViolations == null || constraintViolations.isEmpty())
                return;
            if (this.constraintViolations == null)
                this.constraintViolations = new LinkedHashSet<>();
            this.constraintViolations.addAll(constraintViolations);
        }

        public Set<ConstraintViolation<T>> getConstraintViolations() {
            return constraintViolations;
        }
    }

    public static class SampleValidationResult<T> implements SqlValidationResult<T> {

        T constraintViolations;
        String message;

        public SampleValidationResult(T constraintViolations, String message) {
            this.constraintViolations = constraintViolations;
            this.message = message;
        }

        @Override
        public T getResult() {
            return constraintViolations;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }

    public static class SampleValidatorFactory implements SqlValidatorFactory {

        private static volatile ValidatorFactory factory;

        @Override
        public SqlValidator getSqlValidator() {
            if (factory == null) {
                synchronized (this) {
                    if (factory == null)
                        factory = Validation.buildDefaultValidatorFactory();
                }
            }
            return new SampleValidator(factory.getValidator());
        }
    }
}
