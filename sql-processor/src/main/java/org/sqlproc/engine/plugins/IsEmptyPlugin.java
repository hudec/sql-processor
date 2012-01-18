package org.sqlproc.engine.plugins;

import org.sqlproc.engine.type.SqlMetaType;

public interface IsEmptyPlugin {

    /**
     * 
     * @param obj
     * @param sqlMetaType
     * @param sqlMetaTypeExt
     * @param inSqlSetOrInsert
     * @return
     * @throws IllegalArgumentException
     */
    public boolean isEmpty(Object obj, SqlMetaType sqlMetaType, String sqlMetaTypeExt, boolean inSqlSetOrInsert)
            throws IllegalArgumentException;
}
