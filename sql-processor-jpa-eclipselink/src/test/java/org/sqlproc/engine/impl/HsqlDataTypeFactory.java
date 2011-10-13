package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.dbunit.dataset.datatype.*;

import java.sql.*;

public class HsqlDataTypeFactory extends DefaultDataTypeFactory {
	
	protected final Logger log = LoggerFactory.getLogger(getClass());

	public DataType createDataType(int sqlType, String sqlTypeName)
			throws DataTypeException {
		if (sqlType == Types.BOOLEAN) {
			return DataType.BOOLEAN;
		}

		return super.createDataType(sqlType, sqlTypeName);
	}
}
