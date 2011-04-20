package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;

/**
 * A META SQL sub-element.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaIfItem
 *     SqlMetaText
 *     SqlMetaIdent
 *     SqlMetaConst
 *     SqlMetaAndOr for embedded {}, {&}, {|}
 *     SqlMetaIf for embedded {? }
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIfItem implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The list of sub-elements based on ANTLR grammar.
     */
    List<SqlMetaElement> elements;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    SqlMetaIfItem() {
        this.elements = new ArrayList<SqlMetaElement>();
    }

    /**
     * Adds a new sub-element. It's used from inside ANTLR parser.
     * 
     * @param element
     *            new sub-element, based on ANTLR grammar
     */
    void addElement(SqlMetaElement element) {
        elements.add(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult();
        result.addFalse();
        result.setSql(new StringBuilder());
        boolean like = false;
        boolean onlyText = true;
        boolean skipNextText = false;
        for (SqlMetaElement item : this.elements) {
            if (item instanceof SqlMetaIdent || item instanceof SqlMetaConst || item instanceof SqlMetaIfItem) {
                onlyText = false;
            }
            SqlProcessResult itemResult = item.process(ctx);
            if (itemResult.isAdd()) {
                if (skipNextText && item instanceof SqlMetaText) {
                    continue;
                }
                if (item instanceof SqlMetaIdent || item instanceof SqlMetaConst || item instanceof SqlMetaIfItem) {
                    result.addTrue();
                }
                result.getSql().append(itemResult.getSql());
                result.addInputValues(itemResult.getInputValues());
                result.addMappedInputValues(itemResult.getMappedInputValues());
                result.addOutputValues(itemResult.getOutputValues());
                result.addIdentities(itemResult.getIdentities());
                result.addOutValues(itemResult.getOutValues());
                if (SqlProcessContext.isFeature(SqlFeature.SURROUND_QUERY_LIKE) && item instanceof SqlMetaIdent && like) {
                    for (String ident : itemResult.getInputValues()) {
                        itemResult.getInputValue(ident).setLike(
                                SqlProcessContext.getFeature(SqlFeature.WILDCARD_CHARACTER),
                                SqlProcessContext.getFeatureAsInt(SqlFeature.SURROUND_QUERY_MIN_LEN));
                    }
                } else if (item instanceof SqlMetaText
                        && SqlProcessContext.isFeature(SqlFeature.SURROUND_QUERY_LIKE)
                        && itemResult.getSql().toString().trim().toLowerCase()
                                .endsWith(SqlProcessContext.getFeature(SqlFeature.LIKE_STRING))) {
                    like = true;
                } else {
                    like = false;
                }
                skipNextText = result.isSkipNextText();
            }
        }
        if (onlyText && !SqlUtils.isEmpty(result.getSql()))
            result.addTrue();
        return result;
    }
}
