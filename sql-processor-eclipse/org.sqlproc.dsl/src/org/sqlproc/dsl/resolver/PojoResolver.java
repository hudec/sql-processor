package org.sqlproc.dsl.resolver;

import java.beans.PropertyDescriptor;
import java.io.InputStream;
import java.net.URLClassLoader;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface PojoResolver {

    public static final String POJO_ANNOTATION_CLASS = "org.sqlproc.engine.annotation.Pojo";

    List<URLClassLoader> getAllLoaders();

    Class<?> loadClass(String name);

    public PropertyDescriptor[] getPropertyDescriptors(String name);

    boolean isResolvePojo(EObject model);

    List<Class<?>> getPojoClasses();

    InputStream getFile(EObject model, String filename);
}
