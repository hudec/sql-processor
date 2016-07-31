package org.sqlproc.engine.hibernate.type;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.type.PrimitiveType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The general Hibernate META type.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateType extends SqlMetaType {

    /**
     * The internal slf4j logger.
     */
    protected static final Logger logger = LoggerFactory.getLogger(HibernateType.class);

    /**
     * The map between the Hibernate types names and the Hibernate types.
     */
    static Map<String, Field> hibernateTypes = new HashMap<String, Field>();
    static {
        Field[] fields = StandardBasicTypes.class.getFields();
        for (Field f : fields) {
            if (!Modifier.isStatic(f.getModifiers()))
                continue;
            try {
                if (f.get(null) instanceof Type)
                    hibernateTypes.put(f.getName().toUpperCase(), f);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * The Hibernate type. A standard way to assign the type of a parameter/scalar binding to the Hibernate Query.
     */
    private Type hibernateType;

    /**
     * Creates a new instance of general Hibernate type based on the declaration in the META SQL statement.
     * 
     * @param sMetaType
     *            the name of the Hibernate type, for example INTEGER
     */
    public HibernateType(String sMetaType) {
        String sHibernateType = sMetaType.toUpperCase();
        Field f = hibernateTypes.get(sHibernateType);
        if (f != null) {
            try {
                this.hibernateType = (Type) f.get(null);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new SqlRuntimeException("Unsupported Hibernate Type " + sHibernateType);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        query.addScalar(dbName, hibernateType);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult HIBERNATE: resultInstance=" + resultInstance + ", attributeName="
                    + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null) + ", hibernateType=" + hibernateType);
        }
        if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, hibernateType.getReturnedClass()))
            return;
        if (hibernateType instanceof PrimitiveType)
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue,
                    ((PrimitiveType) hibernateType).getPrimitiveClass()))
                return;
        if (hibernateType.getReturnedClass() == java.util.Date.class)
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, java.sql.Timestamp.class))
                return;
        if (ingoreError) {
            logger.error(
                    "There's no getter for " + attributeName + " in " + resultInstance + ", META type is HIBERNATE");
        } else {
            throw new SqlRuntimeException(
                    "There's no setter for " + attributeName + " in " + resultInstance + ", META type is HIBERNATE");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter HIBERNATE: paramName=" + paramName + ", inputValue=" + inputValue
                    + ", inputType=" + inputType + ", hibernateType=" + hibernateType);
        }
        if (inputValue instanceof Collection) {
            query.setParameterList(paramName, ((Collection) inputValue).toArray(), hibernateType);
        } else {
            query.setParameter(paramName, inputValue, hibernateType);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return null;
    }
}
