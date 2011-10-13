package org.sqlproc.engine.impl;

import org.dbunit.dataset.datatype.DataType;
import org.dbunit.dataset.datatype.DataTypeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleDataTypeFactory extends org.dbunit.ext.oracle.OracleDataTypeFactory {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    public DataType createDataType(int sqlType, String sqlTypeName) throws DataTypeException {

        return super.createDataType(sqlType, sqlTypeName);
    }
}
