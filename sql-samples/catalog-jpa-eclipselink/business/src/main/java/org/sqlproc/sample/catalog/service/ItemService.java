package org.sqlproc.sample.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.sample.catalog.dao.ItemDao;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemService {

    @Autowired
    private ItemDao itemDao;

    @Transactional(readOnly = true)
    public Item findById(Long itemId) {
        return (Item) itemDao.findById(itemId);
    }

    @Transactional
    public Long create(Item item) {
        return itemDao.create(item).getItemid();
    }

    @Transactional
    public Long update(Item item) {
        return itemDao.update(item).getItemid();
    }

    @Transactional
    public void delete(Long itemId) {
        itemDao.remove(itemId);
    }

    @Transactional(readOnly = true)
    public List<ItemTO> find(ItemForm criteria) {
        return itemDao.find(criteria);
    }

    @Transactional(readOnly = true)
    public int findCount(ItemForm criteria) {
        return itemDao.findCount(criteria);
    }
}
