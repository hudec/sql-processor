package org.sqlproc.dsl.resolver;

import java.util.List;

public interface DbResolver {

    public boolean isResolveDb();

    public List<String> getTables();

    public boolean checkTable(String table);

    public List<String> getColumns(String table);

    public boolean checkColumn(String table, String column);
}
