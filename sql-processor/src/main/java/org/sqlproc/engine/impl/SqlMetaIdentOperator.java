package org.sqlproc.engine.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * A META SQL sub-element. It represents a dynamic SQL operator.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIdentOperator implements SqlMetaSimple {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * The related constant input value.
     */
    private SqlMetaConst sqlMetaConst;
    /**
     * The related dynamic input value.
     */
    private SqlMetaIdent sqlMetaIdent;
    /**
     * The list of sub-elements. Every sub-element represents the name of an attribute in the input class (the static
     * parameters class). In case there're more names, the input classes are embedded one in other.
     */
    private List<String> elements;

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param relatedConstantOdIdentifier
     *            the related constant or dynamic input value
     */
    SqlMetaIdentOperator(Object relatedConstantOdIdentifier) {
        if (relatedConstantOdIdentifier != null) {
            if (relatedConstantOdIdentifier instanceof SqlMetaConst) {
                this.sqlMetaConst = (SqlMetaConst) relatedConstantOdIdentifier;
                this.elements = this.sqlMetaConst.getElements();
            } else if (relatedConstantOdIdentifier instanceof SqlMetaIdent) {
                this.sqlMetaIdent = (SqlMetaIdent) relatedConstantOdIdentifier;
                this.elements = this.sqlMetaIdent.getElements();
            }
        }
    }

    /**
     * Adds a new name. This is the name of an attribute in the input class (the dynamic parameters class). In case
     * there're more names, the input classes are embedded one in other.
     * 
     * @param name
     *            the next name in the list of names
     */
    void addConst(String name) {
        elements.add(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> process : staticInputValues=" + ctx.staticInputValues + ", class="
                    + ((ctx.staticInputValues != null) ? ctx.staticInputValues.getClass() : null) + ", related="
                    + ((sqlMetaConst != null) ? sqlMetaConst : sqlMetaIdent));
        }

        SqlProcessResult result = new SqlProcessResult();
        Object obj = ctx.dynamicInputValues;
        Object parentObj = null;
        StringBuilder s = new StringBuilder(elements.size() * 32);
        s.append(IDENT_PREFIX);

        int count = 1;
        String attributeName = null;
        Class<?> attributeType = (obj != null) ? obj.getClass() : null;

        for (String item : this.elements) {
            attributeName = item;
            if (attributeType != null) {
                Class<?> origAttributeType = attributeType;
                attributeType = BeanUtils.getFieldType(attributeType, attributeName);
                if (attributeType == null) {
                    if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_IN)) {
                        logger.error("There's no attribute '" + attributeName + "' for " + origAttributeType);
                    } else {
                        throw new SqlRuntimeException("There's no attribute '" + attributeName + "' for "
                                + origAttributeType);
                    }
                }
            }
            if (count > 1)
                s.append(IDENT_SEPARATOR);
            s.append(attributeName);
            if (obj != null) {
                parentObj = obj;
                obj = BeanUtils.getProperty(obj, item);
            }
            count++;
        }

        result.add(true);
        result.setSql(new StringBuilder("="));

        return result;
    }
}
