package org.sqlproc.engine.config.store;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

/**
 * Aspekt který, se spouští při každé změně hodnot v JMX nastavení. Třída musí mít nastavenou položku
 * {@link PersistentStore}.
 * 
 * @author Juraj Basista
 * @author Tomas Hudec
 * 
 */
@Aspect
public class PersistentAspect {

    protected final Logger logger = LoggerFactory.getLogger("CONFIG");

    /**
     * Implementace úložiště.
     */
    private PersistentStore persistentStore;
    /**
     * Zda je objekt ve stavu, kdy je možné provádět uložení
     */
    private boolean readyToStore;

    /**
     * Metoda uloží obsah nastavení prostřednictvím objektu persistentStore.
     * 
     * @param jp
     *            joinPoint
     */
    @AfterReturning("@annotation(org.springframework.jmx.export.annotation.ManagedOperation) && !execution(* get*(..)) && !execution(* is*(..)) && !execution(* reset())")
    public void store(JoinPoint jp) {
        try {
            if (persistentStore != null && !persistentStore.isSaveToStore()) {
                logger.debug("Ukladání objektu do uložiště není zapnuto.");
                return;
            }
            if (readyToStore) {
                if (persistentStore != null) {
                    logger.info("JMX změna, ukládám nastavení z metody: " + jp.getSignature());
                    persistentStore.store();
                } else {
                    logger.warn("Nemůžu uložit JMX nastavení, store je null: " + jp.getSignature());
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
