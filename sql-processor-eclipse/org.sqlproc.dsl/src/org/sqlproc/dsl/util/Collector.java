package org.sqlproc.dsl.util;

import java.util.Set;

import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IfSql;
import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.IfSqlFragment;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OrdSql2;
import org.sqlproc.dsl.processorDsl.SqlFragment;

public class Collector {

    public static void allVariables(MetaStatement metaStatement, Set<Identifier> identifiers, Set<Constant> constants,
            Set<Column> columns) {

        if (metaStatement.getStatement() != null && metaStatement.getStatement().getSqls() != null) {
            for (SqlFragment sqlFragment : metaStatement.getStatement().getSqls()) {
                if (sqlFragment.getIdent() != null) {
                    identifiers.add(sqlFragment.getIdent());
                } else if (sqlFragment.getCnst() != null) {
                    constants.add(sqlFragment.getCnst());
                } else if (sqlFragment.getCol() != null) {
                    columns.add(sqlFragment.getCol());
                } else if (sqlFragment.getMeta() != null) {
                    if (sqlFragment.getMeta().getIfs() != null) {
                        for (IfSql ifSql : sqlFragment.getMeta().getIfs()) {
                            allVariables(ifSql, identifiers, constants, columns);
                        }
                    }
                    if (sqlFragment.getMeta().getCond() != null) {
                        allVariables(sqlFragment.getMeta().getCond(), identifiers, constants, columns);
                    }
                    if (sqlFragment.getMeta().getOrd() != null && sqlFragment.getMeta().getOrd().getSqls() != null) {
                        for (OrdSql2 ordSql2 : sqlFragment.getMeta().getOrd().getSqls()) {
                            if (ordSql2.getIdent() != null) {
                                identifiers.add(sqlFragment.getIdent());
                            } else if (ordSql2.getCnst() != null) {
                                constants.add(sqlFragment.getCnst());
                            }
                        }
                    }
                }
            }
        }
    }

    public static void allVariables(IfSql ifSql, Set<Identifier> identifiers, Set<Constant> constants,
            Set<Column> columns) {

        if (ifSql.getSqls() != null) {
            for (IfSqlFragment ifSqlFragment : ifSql.getSqls()) {
                if (ifSqlFragment.getIdent() != null) {
                    identifiers.add(ifSqlFragment.getIdent());
                } else if (ifSqlFragment.getCnst() != null) {
                    constants.add(ifSqlFragment.getCnst());
                } else if (ifSqlFragment.getCol() != null) {
                    columns.add(ifSqlFragment.getCol());
                } else if (ifSqlFragment.getMeta() != null) {
                    if (ifSqlFragment.getMeta().getCond() != null) {
                        allVariables(ifSqlFragment.getMeta().getCond(), identifiers, constants, columns);
                    } else if (ifSqlFragment.getMeta().getIfs() != null) {
                        for (IfSql ifSql2 : ifSqlFragment.getMeta().getIfs()) {
                            allVariables(ifSql2, identifiers, constants, columns);
                        }
                    }
                }
            }
        }
    }

    public static void allVariables(IfSqlCond ifSqlCond, Set<Identifier> identifiers, Set<Constant> constants,
            Set<Column> columns) {

        if (ifSqlCond.getBool1() != null) {
            if (ifSqlCond.getBool1().getIdent() != null) {
                identifiers.add(ifSqlCond.getBool1().getIdent());
            } else if (ifSqlCond.getBool1().getCnst() != null) {
                constants.add(ifSqlCond.getBool1().getCnst());
            } else if (ifSqlCond.getBool1().getCond() != null) {
                allVariables(ifSqlCond.getBool1().getCond(), identifiers, constants, columns);
            }
        }
        if (ifSqlCond.getBool2() != null) {
            for (IfSqlBool ifSqlBool : ifSqlCond.getBool2()) {
                if (ifSqlBool.getIdent() != null) {
                    identifiers.add(ifSqlBool.getIdent());
                } else if (ifSqlBool.getCnst() != null) {
                    constants.add(ifSqlBool.getCnst());
                } else if (ifSqlBool.getCond() != null) {
                    allVariables(ifSqlBool.getCond(), identifiers, constants, columns);
                }
            }
        }
    }

    public static void allVariables(MappingRule mappingRule, Set<MappingColumn> columns) {

        if (mappingRule.getMapping() != null && mappingRule.getMapping().getMappingItems() != null) {
            for (MappingItem mappingItem : mappingRule.getMapping().getMappingItems()) {
                if (mappingItem.getAttr() != null) {
                    columns.add(mappingItem.getAttr());
                }
            }
        }
    }
}
