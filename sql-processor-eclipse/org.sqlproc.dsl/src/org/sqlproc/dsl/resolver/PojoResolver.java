package org.sqlproc.dsl.resolver;

import java.beans.PropertyDescriptor;
import java.net.URLClassLoader;
import java.util.List;

public interface PojoResolver {

    List<URLClassLoader> getAllLoaders();

    Class<?> loadClass(String name);

    public PropertyDescriptor[] getPropertyDescriptors(String name);

    boolean isResolvePojo();
}
