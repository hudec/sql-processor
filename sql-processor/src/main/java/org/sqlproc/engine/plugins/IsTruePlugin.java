package org.sqlproc.engine.plugins;

import org.sqlproc.engine.type.SqlMetaType;

public interface IsTruePlugin {

    /**
     * 
     * @param obj
     * @param sqlMetaType
     * @param sqlMetaTypeExt
     * @return
     */
    public boolean isTrue(Object obj, SqlMetaType sqlMetaType, String sqlMetaTypeExt);
}
