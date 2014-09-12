package org.sqlproc.sample.simple.type;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.type.StringType;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.sample.simple.model.PhoneNumber;

public class PhoneNumberType extends SqlInternalType {

    static Pattern pattern = Pattern.compile("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$");

    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { PhoneNumber.class };
    }

    @Override
    public String[] getMetaTypes() {
        return new String[] { "phone" };
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        query.addScalar(dbName, StringType.INSTANCE);
    }

    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {

        Method m = BeanUtils.getSetter(resultInstance, attributeName, PhoneNumber.class);
        if (m == null) {
            if (ingoreError) {
                logger.error("There's no getter for " + attributeName + " in " + resultInstance
                        + ", META type is PhoneNumberType");
                return;
            } else {
                throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                        + ", META type is PhoneNumberType");
            }
        }

        if (resultValue == null) {
            BeanUtils.simpleInvokeMethod(m, resultInstance, null);
            return;
        }

        if (!(resultValue instanceof String)) {
            if (ingoreError) {
                logger.error("Incorrect result value type " + resultValue + ", it should be a string");
                return;
            } else {
                throw new SqlRuntimeException("Incorrect result value type " + resultValue + ", it should be a string");
            }
        }

        String sPhoneNumber = (String) resultValue;
        Matcher matcher = pattern.matcher(sPhoneNumber);
        if (!matcher.matches()) {
            if (ingoreError) {
                logger.error("Incorrect result phone number format '" + sPhoneNumber + "'");
                return;
            } else {
                throw new SqlRuntimeException("Incorrect result phone number format '" + sPhoneNumber + "'");
            }
        }

        int area = Integer.parseInt(matcher.group(1));
        int exch = Integer.parseInt(matcher.group(2));
        int ext = Integer.parseInt(matcher.group(3));
        BeanUtils.simpleInvokeMethod(m, resultInstance, new PhoneNumber(area, exch, ext));
    }

    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, StringType.INSTANCE);
        } else {
            if (inputValue instanceof Collection) {
                List<String> phoneNumbers = new ArrayList<String>();
                for (Iterator iter = ((Collection) inputValue).iterator(); iter.hasNext();) {
                    Object o = iter.next();
                    if (o != null) {
                        if (!(o instanceof PhoneNumber)) {
                            if (ingoreError) {
                                logger.error("Incorrect input value type " + o + ", it should be a PhoneNumber");
                                continue;
                            } else {
                                throw new SqlRuntimeException("Incorrect input value type " + o
                                        + ", it should be a PhoneNumber");
                            }
                        }
                        String sPhoneNumber = ((PhoneNumber) o).toString();
                    }
                }
                query.setParameterList(paramName, phoneNumbers.toArray(), StringType.INSTANCE);
            } else {
                if (!(inputValue instanceof PhoneNumber)) {
                    if (ingoreError) {
                        logger.error("Incorrect input value type " + inputValue + ", it should be a PhoneNumber");
                        return;
                    } else {
                        throw new SqlRuntimeException("Incorrect input value type " + inputValue
                                + ", it should be a PhoneNumber");
                    }
                }
                PhoneNumber phoneNumber = (PhoneNumber) inputValue;
                String sPhoneNumber = String.format("%03d-%03d-%04d", phoneNumber.getArea(), phoneNumber.getExch(),
                        phoneNumber.getExt());
                query.setParameter(paramName, sPhoneNumber, StringType.INSTANCE);
            }
        }
    }
}
