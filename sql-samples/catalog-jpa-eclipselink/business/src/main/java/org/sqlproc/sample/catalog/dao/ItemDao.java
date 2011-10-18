package org.sqlproc.sample.catalog.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jpa.eclipselink.JpaSimpleSession;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemDao {

    @PersistenceContext
    private EntityManager entityManager;

    protected SqlEngineFactory sqlFactory;

    private SqlSession getSqlSession() {
        SqlSession session = new JpaSimpleSession(this.entityManager);
        return session;
    }

    public Item findById(Serializable id) {
        Item entity = (Item) this.entityManager.find(Item.class, id);
        return entity;
    }

    public Item create(Item entity) {
        this.entityManager.persist(entity);
        this.entityManager.flush();
        return entity;
    }

    public Item update(Item entity) {
        entity = this.entityManager.merge(entity);
        this.entityManager.flush();
        return entity;
    }

    public void remove(Serializable entityId) {
        Item entity = this.entityManager.getReference(Item.class, entityId);
        if (entity != null) {
            this.remove(entity);
        }
    }

    protected void remove(Item entity) {
        this.entityManager.remove(entity);
        this.entityManager.flush();
    }

    public List<ItemTO> find(ItemForm criteria) {
        SqlSession session = getSqlSession();
        return getQueryEngine("ITEMS").query(session, ItemTO.class, criteria, null,
                SqlOrder.getOrder(criteria.getOrder()), 0, criteria.getCount(), criteria.getFirst());
    }

    public int findCount(ItemForm criteria) {
        SqlSession session = getSqlSession();
        return getQueryEngine("ITEMS").queryCount(session, criteria);
    }

    public SqlQueryEngine getQueryEngine(String name) {
        SqlQueryEngine queryEngine = sqlFactory.getQueryEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
