package org.sqlproc.engine.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to signify that a public API (public class, method or field) is subject to incompatible
 * changes, or even removal, in a future release..
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Documented
public @interface Beta {
}
