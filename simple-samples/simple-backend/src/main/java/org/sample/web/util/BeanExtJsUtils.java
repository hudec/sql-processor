package org.sample.web.util;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.DateConverter;
import org.sample.auth.model.Authuser;
import org.sample.model.Person;
import org.sample.web.form.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.impl.SqlStandardControl;

import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.SortDirection;
import ch.ralscha.extdirectspring.bean.SortInfo;
import ch.ralscha.extdirectspring.filter.Filter;
import ch.ralscha.extdirectspring.filter.StringFilter;

public class BeanExtJsUtils {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected BeanUtilsBean beanUtilsBean;

    public BeanExtJsUtils() {
        beanUtilsBean = new BeanUtilsBean(new ConvertUtilsBean() {

            @Override
            public Object convert(String value, Class clazz) {
                if (clazz.isEnum()) {
                    if (value == null || value.isEmpty()) {
                        return null;
                    }
                    return Enum.valueOf(clazz, value);

                } else {
                    return super.convert(value, clazz);
                }
            }
        });

        DateConverter dateConverter = new DateConverter(null);
        dateConverter.setPattern("dd.MM.yyyy");
        beanUtilsBean.getConvertUtils().register(dateConverter, Date.class);

    }

    public <E> E buildFormFromFilters(List<Filter> filters, Class<E> formClass) throws Exception {

        E form = BeanUtils.getInstance(formClass);

        for (Filter filter : filters) {
            String value = ((StringFilter) filter).getValue();
            String key = filter.getField();
            logger.info("buildFormFromFilters " + formClass + "'" + key + "' '" + value + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    public <E> E buildFormFromParams(Map<String, Object> params, Class<E> formClass) throws Exception {

        E form = BeanUtils.getInstance(formClass);

        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            Object value = p.getValue();
            if (value == null || ((value instanceof String) && ((String) value).length() == 0))
                continue;
            logger.info("buildFormFromParams for " + formClass + "'" + key + "' '" + value + "' '" + value.getClass()
                    + "'");
            if (formClass == PersonForm.class) {
                if ("contacts".equals(key) && value instanceof Boolean && ((Boolean) value)) {
                    ((Person) form).setInit(Person.Association.contacts);
                    continue;
                }
                if ("relatives".equals(key) && value instanceof Boolean && ((Boolean) value)) {
                    ((Person) form).setInit(Person.Association.relatives);
                    continue;
                }
            }
            if (formClass == Authuser.class) {
            	if ("userroles".equals(key) && value instanceof Boolean && ((Boolean) value)) {
                    ((Authuser) form).setInit(Authuser.Association.userroles);
                    continue;
                }
            }
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    public SqlStandardControl buildControlFromParams(ExtDirectStoreReadRequest request) {
        SqlStandardControl sqlControl = new SqlStandardControl();
        if (request.getStart() != null)
            sqlControl.setFirstResult(request.getStart());
        if (request.getLimit() != null)
            sqlControl.setMaxResults(request.getLimit());
        return sqlControl;
    }

    public <E> void buildSortFromParams(Class<E> pojoClass, SqlStandardControl sqlControl, List<SortInfo> sorters) {
        for (SortInfo sort : sorters) {
            String orderBy = "ORDER_BY_" + constName(sort.getProperty());
            Integer orderByValue = getOrderByValue(pojoClass, orderBy);
            if (orderByValue != null) {
                if (sort.getDirection() == SortDirection.ASCENDING)
                    sqlControl.setAscOrder(orderByValue);
                else if (sort.getDirection() == SortDirection.DESCENDING)
                    sqlControl.setDescOrder(orderByValue);
                return;
            }
        }
        String orderBy = "ORDER_BY_ID";
        Integer orderByValue = getOrderByValue(pojoClass, orderBy);
        if (orderByValue != null) {
            sqlControl.setAscOrder(Person.ORDER_BY_ID);
        }
    }

    public <E> Integer getOrderByValue(Class<E> pojoClass, String orderBy) {
        Field field = null;
        try {
            field = pojoClass.getDeclaredField(orderBy);
        } catch (SecurityException e) {
            return null;
        } catch (NoSuchFieldException e) {
            return null;
        }
        try {
            int value = field.getInt(null);
            return value;
        } catch (IllegalArgumentException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public String constName(String name) {
        String result = "";
        int last = 0;
        for (int i = 0, l = name.length(); i < l; i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                result = result + name.substring(last, i).toUpperCase() + "_";
                last = i;
            }
        }
        if (last < name.length())
            result = result + name.substring(last).toUpperCase();
        return result;
    }
}
