package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element. It represents a static input value.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaConst
 *     +-SqlMetaConstItem.SqlMetaConstItem...^SqlMyType^value
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIdentOperator implements SqlMetaSimple {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * An indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard behavior
     * is to add an input value only in the case it's not empty. The definition of the emptiness depends on the type of
     * the input value.
     */
    private boolean symbolic;
    /**
     * The list of sub-elements. Every sub-element represents the name of an attribute in the input class (the static
     * parameters class). In case there're more names, the input classes are embedded one in other.
     */
    private List<String> elements;

    /**
     * Values for a special identifier handling, for example a sequence for an identity.
     */
    Map<String, String> values = new HashMap<String, String>();

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param not
     *            an indicator, which is used to control, how the input value is added to the final ANSI SQL
     */
    SqlMetaIdentOperator(boolean symbolic) {
        this.symbolic = symbolic;
    }

    /**
     * Adds a new name. This is the name of an attribute in the input class (the static parameters class). In case
     * there're more names, the input classes are embedded one in other.
     * 
     * @param name
     *            the next name in the list of names
     */
    void addConst(String name) {
        String[] names = name.split("=");
        elements.add(names[0]);
    }

    /**
     * Sets the indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard
     * behavior is to add an input value only in the case it's not empty. The definition of the emptiness depends on the
     * type of the input value.
     * 
     * @param not
     *            a new indicator value
     */
    void setSymbolic(boolean symbolic) {
        this.symbolic = symbolic;
    }

    /**
     * Returns the indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard
     * behavior is to add an input value only in the case it's not empty. The definition of the emptiness depends on the
     * type of the input value.
     * 
     * @return the indicator value
     */
    boolean isSymbolic() {
        return symbolic;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> process : staticInputValues=" + ctx.staticInputValues + ", class="
                    + ((ctx.staticInputValues != null) ? ctx.staticInputValues.getClass() : null) + ", symbolic="
                    + symbolic);
        }

        SqlProcessResult result = new SqlProcessResult();
        return result;
    }
}
