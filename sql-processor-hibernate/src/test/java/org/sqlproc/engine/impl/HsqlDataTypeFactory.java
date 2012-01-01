package org.sqlproc.engine.impl;

import org.dbunit.dataset.datatype.DataType;
import org.dbunit.dataset.datatype.DataTypeException;
import org.dbunit.ext.hsqldb.HsqldbDataTypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsqlDataTypeFactory extends HsqldbDataTypeFactory {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    public DataType createDataType(int sqlType, String sqlTypeName) throws DataTypeException {
        // if (sqlType == Types.BOOLEAN) {
        // return DataType.BOOLEAN;
        // }

        return super.createDataType(sqlType, sqlTypeName);
    }
}
