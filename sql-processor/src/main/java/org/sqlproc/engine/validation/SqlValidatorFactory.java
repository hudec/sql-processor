package org.sqlproc.engine.validation;

/**
 * The factory definition, which can be used to construct the {@link SqlValidator} instances.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example. Another approch is the next one (for the sample
 * validator described at {@link SqlValidator}.
 * 
 * <pre>
 * SqlValidatorFactory validatorFactory = new SampleValidator.SampleValidatorFactory();
 * SqlEngineFactory factory = ...
 * SqlCrudEngine sqlEngine = factory.getCrudEngine(name);
 * sqlEngine.setValidator(validatorFactory.getSqlValidator());
 * </pre>
 * 
 * <p>
 * For more information please see {@link SqlValidator}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlValidatorFactory {
    /**
     * The main contract of this factory.
     * 
     * @return the instance of the SqlValidator
     */
    SqlValidator getSqlValidator();
}
