package org.sqlproc.dsl.resolver;

import java.beans.PropertyDescriptor;
import java.net.URLClassLoader;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface PojoResolver {

    List<URLClassLoader> getAllLoaders();

    Class<?> loadClass(String name);

    public PropertyDescriptor[] getPropertyDescriptors(String name);

    boolean isResolvePojo(EObject model);
}
