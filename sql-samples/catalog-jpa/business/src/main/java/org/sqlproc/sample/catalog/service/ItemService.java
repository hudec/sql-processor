package org.sqlproc.sample.catalog.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.catalog.dao.ItemDao;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemService {

    protected SqlSessionFactory sessionFactory;
    protected ItemDao itemDao;

    @Transactional(readOnly = true)
    public Item findById(Long itemId) {
        return (Item) itemDao.findById((Session) (sessionFactory.getSqlSession()), itemId);
    }

    @Transactional
    public Long create(Item item) {
        return itemDao.store((Session) (sessionFactory.getSqlSession()), item).getItemid();
    }

    @Transactional
    public Long update(Item item) {
        return itemDao.store((Session) (sessionFactory.getSqlSession()), item).getItemid();
    }

    @Transactional
    public void delete(Long itemId) {
        Session sqlSession = (Session) sessionFactory.getSqlSession();
        Item item = itemDao.findById(sqlSession, itemId);
        if (item != null)
            itemDao.remove(sqlSession, item);
    }

    @Transactional(readOnly = true)
    public List<ItemTO> find(ItemForm criteria) {
        return itemDao.find(sessionFactory.getSqlSession(), criteria);
    }

    @Transactional(readOnly = true)
    public int findCount(ItemForm criteria) {
        return itemDao.findCount(sessionFactory.getSqlSession(), criteria);
    }

    @Required
    public void setSessionFactory(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Required
    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
