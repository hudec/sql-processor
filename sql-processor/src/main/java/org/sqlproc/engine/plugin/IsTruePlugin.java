package org.sqlproc.engine.plugin;

import java.util.Map;

import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugin devoted to evaluate the boolean value of the logical expression.
 * 
 * <p>
 * A boolean expression is an expression of the input values with the following operands between them:
 * <ul>
 * <li>! an exclamation mark - for a logical negation</li>
 * <li>( and ) left and right round brackets – for a logical grouping</li>
 * <li>&& two ampersands – for a logical conjunction</li>
 * <li>|| two vertical bars – for a logical disjunction</li>
 * </ul>
 * 
 * <p>
 * The standard evaluation is the next one:
 * <p>
 * A logical value of an input value (dynamic or static) depends on the Java type of the related attribute. If the value
 * is null, it is evaluated as false. Otherwise it is evaluated as true in the following cases
 * <ul>
 * <li>Boolean or boolean – a logical value of the related attribute</li>
 * <li>any type of Number – if the related attribute value is a positive one</li>
 * <li>String - if the related attribute length is greater than zero. A special case is a token false, which is
 * evaluated as false.</li>
 * <li>an enumeration based attribute is treated in a special way, please see the advanced tutorial</li>
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface IsTruePlugin {

    /**
     * Used for the evaluation of the logical expression in the conditional META SQL fragments.
     * 
     * @param attributeName
     *            the name of the input value
     * @param obj
     *            the input value
     * @param parentObj
     *            the parent of the input value
     * @param sqlMetaType
     *            the internal type (= META type) devoted for the special processing of the input values
     * @param sqlMetaTypeExt
     *            the META type extension (=the internal type supplement value) devoted to extend the special processing
     *            of the input values
     * @param features
     *            the optional features in the statement coontext
     * @return the boolean value of the logical expression
     */
    public boolean isTrue(String attributeName, Object obj, Object parentObj, SqlMetaType sqlMetaType,
            String sqlMetaTypeExt, Map<String, Object> features);
}
