package org.sample;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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
        Validator validator = sampleContext.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validateValue(parentType, propertyName, value);
        sampleContext.addConstraintViolations(constraintViolations);
    }

    @Override
    public <T> SqlValidationContext<T> start(Class<T> parentType) {
        return new SampleValidationContext<T>(validator);
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
        Validator validator;
        Set<ConstraintViolation<T>> constraintViolations;

        public SampleValidationContext(Validator validator) {
            this.validator = validator;
        }

        public Validator getValidator() {
            return validator;
        }

        public void addConstraintViolations(Set<ConstraintViolation<T>> constraintViolations) {
            if (this.constraintViolations == null)
                this.constraintViolations = constraintViolations;
            else
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

        static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        static SampleValidator validator;

        @Override
        public SqlValidator getSqlValidator() {
            if (validator == null) {
                synchronized (this) {
                    if (validator == null)
                        validator = new SampleValidator(factory.getValidator());
                }
            }
            return validator;
        }
    }
}
