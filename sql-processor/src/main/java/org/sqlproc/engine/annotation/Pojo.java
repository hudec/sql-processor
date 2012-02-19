package org.sqlproc.engine.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation is used by the advanced template <b>pojos</b>.
 * <p>
 * It helps to load the definitions of all POJO classes (the output classes or search forms) on the classpath. To enable
 * the POJOs detection, these classes must be annotated this annotation.
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki/Eclipse-plugin-tutorial">Eclipse
 * plugin tutorial</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@Retention(RUNTIME)
@Target({ TYPE })
public @interface Pojo {
}
