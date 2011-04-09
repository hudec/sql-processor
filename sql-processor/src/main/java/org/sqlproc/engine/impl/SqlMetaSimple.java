package org.sqlproc.engine.impl;

/**
 * The ancestor of simple META SQL sub-elements.
 * 
 * In fact it's a marker interface for
 * <ul>
 * <li>{@link org.sqlproc.engine.impl.SqlMetaText}
 * <li>{@link org.sqlproc.engine.impl.SqlMetaIdent}
 * <li>{@link org.sqlproc.engine.impl.SqlMetaConst}
 * <li>{@link org.sqlproc.engine.impl.SqlMetaOrd}
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
interface SqlMetaSimple extends SqlMetaElement {

}
