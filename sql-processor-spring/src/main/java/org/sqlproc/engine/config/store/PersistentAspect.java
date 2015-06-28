package org.sqlproc.engine.config.store;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

/**
 * The aspect monitoring the configuration changes. In the case the configuration value is changed, the overall
 * configuration is persisted.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@Aspect
public class PersistentAspect {

    protected final Logger logger = LoggerFactory.getLogger("CONFIG");

    private PersistentStore persistentStore;

    private boolean readyToStore;

    @AfterReturning("@annotation(org.springframework.jmx.export.annotation.ManagedOperation) && !execution(* get*(..)) && !execution(* is*(..)) && !execution(* reset())")
    public void store(JoinPoint jp) {
        try {
            if (persistentStore != null && !persistentStore.isSaveToStore()) {
                logger.debug("SQLP JMX: The configuration persistency is not activated.");
                return;
            }
            if (readyToStore) {
                if (persistentStore != null) {
                    logger.info("SQLP JMX: The configuration has been changed in: " + jp.getSignature());
                    persistentStore.store();
                } else {
                    logger.warn("SQLP JMX: The configuration can't be persisted in: " + jp.getSignature());
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    @Required
    public void setPersistentStore(PersistentStore persistentStore) {
        this.persistentStore = persistentStore;
        readyToStore = true;
    }
}
