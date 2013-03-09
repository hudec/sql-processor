package org.sqlproc.dsl.resolver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.sqlproc.dsl.resolver.DbResolverBean.DatabaseDirectives;

public interface DbResolver {

    public enum DbType {
        ORACLE("Oracle"), MY_SQL("MySQL"), HSQLDB("HSQLDB"), POSTGRESQL("PostgreSQL"), INFORMIX("Informix"), DB2("DB2"), MS_SQL(
                "MS SQL");
        private static Map<String, DbType> identifierMap = new HashMap<String, DbType>();

        static {
            for (DbType value : DbType.values()) {
                identifierMap.put(value.getValue(), value);
            }
        }
        private String value;

        private DbType(String value) {
            this.value = value;
        }

        public static DbType fromValue(String value) {
            DbType result = identifierMap.get(value);
            if (result == null) {
                throw new IllegalArgumentException("No DbType for value: " + value);
            }
            return result;
        }

        public String getValue() {
            return value;
        }
    }

    boolean isResolveDb(EObject model);

    DatabaseDirectives getDatabaseDirectives(EObject model);

    List<String> getTables(EObject model);

    boolean checkTable(EObject model, String table);

    List<String> getColumns(EObject model, String table);

    boolean checkColumn(EObject model, String table, String column);

    List<DbColumn> getDbColumns(EObject model, String table);

    List<DbExport> getDbExports(EObject model, String table);

    List<DbImport> getDbImports(EObject model, String table);

    List<String> getDbPrimaryKeys(EObject model, String table);

    String getType(EObject model, String table, String column);

    List<DbIndex> getDbIndexes(EObject model, String table);

    List<String> getSequences(EObject model);

    String getDbMetaInfo(EObject model);

    String getDbDriverInfo(EObject model);
}
