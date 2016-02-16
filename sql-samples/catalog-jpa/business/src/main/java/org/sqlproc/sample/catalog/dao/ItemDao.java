package org.sqlproc.sample.catalog.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Required;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.model.OrderIds;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemDao {

    protected SqlEngineFactory sqlFactory;

    public Item findById(Session sqlSession, Serializable id) {
        Item entity = (Item) sqlSession.get(Item.class, id);
        return entity;
    }

    public Item store(Session sqlSession, Item entity) {
        entity = (Item) sqlSession.merge(entity);
        sqlSession.flush();
        return entity;
    }

    public void remove(Session sqlSession, Item entity) {
        sqlSession.delete(entity);
        sqlSession.flush();
    }

    public List<ItemTO> find(SqlSession sqlSession, ItemForm criteria) {
        return sqlFactory.getCheckedQueryEngine("ITEMS").query(sqlSession, ItemTO.class, criteria, null,
                OrderIds.getOrder(criteria.getOrder()), 0, criteria.getCount(), criteria.getFirst());
    }

    public int findCount(SqlSession sqlSession, ItemForm criteria) {
        return sqlFactory.getCheckedQueryEngine("ITEMS").queryCount(sqlSession, criteria);
    }

    @Required
    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
