package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        SqlProcessResult result = new SqlProcessResult(ctx);
        result.addFalse();
        result.setSql(new StringBuilder());
        boolean like = false;
        boolean onlyText = true;
        boolean skipNextText = false;
        boolean skipNextIdent = false;
        for (SqlMetaElement item : this.elements) {
            if ((item instanceof SqlMetaIdent || item instanceof SqlMetaConst || item instanceof SqlMetaIfItem)
                    && !(item instanceof SqlMetaOperator)) {
                onlyText = false;
            }
            if (skipNextIdent && item instanceof SqlMetaIdent) {
                skipNextIdent = false;
                result.addTrue();
                continue;
            } else if (!(item instanceof SqlMetaText)) {
                skipNextIdent = false;
            }
            SqlProcessResult itemResult = item.process(ctx);
            if (itemResult.isAdd()) {
                if (skipNextText && item instanceof SqlMetaText) {
                    continue;
                }
                if (item instanceof SqlMetaOperator && "is null".equalsIgnoreCase(itemResult.getSql().toString())) {
                    skipNextIdent = true;
                }
                if ((item instanceof SqlMetaIdent || item instanceof SqlMetaConst || item instanceof SqlMetaIfItem)
                        && !(item instanceof SqlMetaOperator)) {
                    result.addTrue();
                }
                result.addInputValues(itemResult.getInputValues());
                result.addMappedInputValues(itemResult.getMappedInputValues());
                result.addOutputValues(itemResult.getOutputValues());
                result.addIdentities(itemResult.getIdentities());
                result.addOutValues(itemResult.getOutValues());
                if (item instanceof SqlMetaIdent
                        && like
                        && (ctx.isFeature(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL) || ctx
                                .isFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL))) {
                    for (String ident : itemResult.getInputValues()) {
                        itemResult.getInputValue(ident).setLike(ctx.getFeature(SqlFeature.WILDCARD_CHARACTER),
                                ctx.getFeatureAsInt(SqlFeature.SURROUND_QUERY_MIN_LEN),
                                ctx.isFeature(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL));
                    }
                } else if (item instanceof SqlMetaIdent && like
                        && ctx.getFeatureAsObject(SqlFeature.REPLACE_LIKE_CHARS) != null) {
                    for (String ident : itemResult.getInputValues()) {
                        itemResult.getInputValue(ident).setReplaceChars(
                                (Map<String, String>) ctx.getFeatureAsObject(SqlFeature.REPLACE_LIKE_CHARS));
                    }
                } else if (item instanceof SqlMetaText
                        && (ctx.isFeature(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL)
                                || ctx.isFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL) || ctx
                                .getFeatureAsObject(SqlFeature.REPLACE_LIKE_CHARS) != null)
                        && itemResult.getSql().toString().trim().toLowerCase()
                                .endsWith(ctx.getFeature(SqlFeature.LIKE_STRING))) {
                    String replaceLike = ctx.getFeature(SqlFeature.REPLACE_LIKE_STRING);
                    if (replaceLike != null) {
                        itemResult.setSql(new StringBuilder(itemResult.getSql().toString().toLowerCase()
                                .replace(ctx.getFeature(SqlFeature.LIKE_STRING), replaceLike)));
                    }
                    like = true;
                } else {
                    if (!like || !(item instanceof SqlMetaText) || !((SqlMetaText) item).isWhite())
                        like = false;
                }
                result.getSql().append(itemResult.getSql());
                skipNextText = itemResult.isSkipNextText();
            }
        }
        if (onlyText && !SqlUtils.isEmpty(result.getSql()))
            result.addTrue();
        return result;
    }
}
