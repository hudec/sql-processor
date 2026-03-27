package org.sqlproc.engine.jdbc.type;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlTaggedMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The JDBC META type UUID.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcUuidType implements SqlTaggedMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { UUID.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "UUID" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        query.addScalar(dbName, Types.OTHER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ignoreError) throws SqlRuntimeException {

        if (resultValue == null) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, null, UUID.class))
                return;
            handleError(ignoreError, "There's no setter for " + attributeName + " in " + resultInstance, null);
            return;
        }

        UUID uuid = null;
        try {
            if (resultValue instanceof UUID) {
                uuid = (UUID) resultValue;
            } else if (resultValue instanceof String) {
                uuid = UUID.fromString((String) resultValue);
            } else if (resultValue instanceof byte[]) {
                handleError(ignoreError, "Binary UUID conversion not implemented", null);
                return;
            }
        } catch (IllegalArgumentException e) {
            handleError(ignoreError, "Incorrect UUID format: " + resultValue, e);
            return;
        }

        if (uuid != null && runtimeCtx.simpleSetAttribute(resultInstance, attributeName, uuid, UUID.class)) {
            return;
        }

        handleError(ignoreError, "Problem setting UUID attribute " + attributeName, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ignoreError, Class<?>... inputTypes) throws SqlRuntimeException {

        if (inputValue == null) {
            query.setParameter(paramName, null, Types.OTHER);
        } else {
            if (inputValue instanceof Collection) {
                List<UUID> uuids = new ArrayList<>();
                for (Object o : (Collection<?>) inputValue) {
                    if (o != null) {
                        if (!(o instanceof UUID)) {
                            handleError(ignoreError, "Incorrect input value type " + o + ", should be UUID", null);
                            continue;
                        }
                        uuids.add((UUID) o);
                    }
                }
                query.setParameterList(paramName, uuids.toArray(), Types.OTHER);
            } else {
                if (!(inputValue instanceof UUID)) {
                    handleError(ignoreError, "Incorrect input value type " + inputValue + ", should be UUID", null);
                    return;
                }
                query.setParameter(paramName, inputValue, Types.OTHER);
            }
        }
    }

    /**
     * Handles an error by either logging it or throwing a {@link SqlRuntimeException}.
     * 
     * @param ignoreError
     *            whether to log the error instead of throwing
     * @param msg
     *            the error message
     * @param e
     *            the optional cause
     */
    private void handleError(boolean ignoreError, String msg, Exception e) {
        if (ignoreError) {
            logger.error(msg + (e != null ? ": " + e.getMessage() : ""));
        } else {
            throw new SqlRuntimeException(msg, e);
        }
    }
}
