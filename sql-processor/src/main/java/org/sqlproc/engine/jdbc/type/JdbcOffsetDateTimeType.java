package org.sqlproc.engine.jdbc.type;

import java.sql.Timestamp;
import java.sql.Types;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlTaggedMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The JDBC META type OFFSETDATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcOffsetDateTimeType implements SqlTaggedMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { OffsetDateTime.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "OFFSETDATETIME" };
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
        query.addScalar(dbName, Types.TIMESTAMP_WITH_TIMEZONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ignoreError) throws SqlRuntimeException {

        if (resultValue == null) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, null, OffsetDateTime.class))
                return;
            handleError(ignoreError, "There's no setter for " + attributeName + " in " + resultInstance, null);
            return;
        }

        OffsetDateTime dateTime = null;
        try {
            if (resultValue instanceof OffsetDateTime) {
                dateTime = (OffsetDateTime) resultValue;
            } else if (resultValue instanceof Timestamp) {
                dateTime = ((Timestamp) resultValue).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
            } else if (resultValue instanceof String) {
                dateTime = OffsetDateTime.parse((String) resultValue);
            }
        } catch (Exception e) {
            handleError(ignoreError, "Incorrect OffsetDateTime format: " + resultValue, e);
            return;
        }

        if (dateTime != null
                && runtimeCtx.simpleSetAttribute(resultInstance, attributeName, dateTime, OffsetDateTime.class)) {
            return;
        }

        handleError(ignoreError, "Problem setting OffsetDateTime attribute " + attributeName, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ignoreError, Class<?>... inputTypes) throws SqlRuntimeException {

        if (inputValue == null) {
            query.setParameter(paramName, null, Types.TIMESTAMP_WITH_TIMEZONE);
        } else {
            if (inputValue instanceof Collection) {
                List<OffsetDateTime> dates = new ArrayList<>();
                for (Object o : (Collection<?>) inputValue) {
                    if (o != null) {
                        if (!(o instanceof OffsetDateTime)) {
                            handleError(ignoreError, "Incorrect input value type " + o + ", should be OffsetDateTime",
                                    null);
                            continue;
                        }
                        dates.add((OffsetDateTime) o);
                    }
                }
                query.setParameterList(paramName, dates.toArray(), Types.TIMESTAMP_WITH_TIMEZONE);
            } else {
                if (!(inputValue instanceof OffsetDateTime)) {
                    handleError(ignoreError, "Incorrect input value type " + inputValue + ", should be OffsetDateTime",
                            null);
                    return;
                }
                query.setParameter(paramName, inputValue, Types.TIMESTAMP_WITH_TIMEZONE);
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
