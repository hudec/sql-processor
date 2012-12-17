package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Subscriber;

public class SubscriberDao extends BaseDao {

    public SubscriberDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Subscriber insertLibrarySubscriber(Library library, Subscriber subscriber) {
        SqlCrudEngine sqlInsertSubscriber = getCrudEngine("INSERT_SUBSCRIBER");
        if (subscriber != null) {
            subscriber.setLibrary(library);
            int count = sqlInsertSubscriber.insert(session, subscriber);
            logger.info("insert subscriber: " + count + ": " + subscriber);
            if (count > 0)
                library.getSubscribers().add(subscriber);
        }
        return subscriber;
    }

    public Subscriber getSubscriber(Subscriber subscriber) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_SUBSCRIBER");
        Map<String, Class<?>> moreResultClasses = null;
        if (subscriber.toInit(Subscriber.Association.billingDetails)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("BA", BankAccount.class);
            moreResultClasses.put("CC", CreditCard.class);
        }
        Subscriber s = sqlEngine.get(session, Subscriber.class, subscriber, null, moreResultClasses);
        logger.info("get subscriber: " + s);
        return s;
    }

    public Subscriber getSubscriber(Subscriber subscriber, Map<String, Class<?>> moreResultClasses) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_SUBSCRIBER");
        Subscriber s = sqlEngine.get(session, Subscriber.class, subscriber, null, moreResultClasses);
        logger.info("get subscriber: " + s);
        return s;
    }

    public Subscriber updateSubscriber(Subscriber subscriber) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_SUBSCRIBER");
        int count = sqlEngine.update(session, subscriber);
        logger.info("update subscriber: " + count);
        return (count > 0) ? subscriber : null;
    }

    public boolean deleteSubscriber(Subscriber subscriber) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_SUBSCRIBER");
        int count = sqlEngine.delete(session, subscriber);
        logger.info("delete subscriber: " + count);
        return (count > 0);
    }

}
