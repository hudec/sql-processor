package org.sqlproc.dsl.ui.resolver;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.resolver.PojoResolver;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class WorkspacePojoResolverImpl implements PojoResolver {

    protected Logger LOGGER = Logger.getLogger(WorkspacePojoResolverImpl.class);
    // private static final Class[] EMPTY_CLASS_PARAMETERS = new Class[0];
    // private static final Class[] LIST_CLASS_PARAMETER = new Class[] { java.util.List.class };

    @Inject
    ModelProperty modelProperty;

    private List<URLClassLoader> allLoaders;

    protected void init() {
        LOGGER.info("POJO START");
        List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
        List<URLClassLoader> loaders = new ArrayList<URLClassLoader>();
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        for (IProject project : projects) {
            try {
                project.open(null /* IProgressMonitor */);
                IJavaProject javaProject = JavaCore.create(project);
                javaProjects.add(javaProject);
                String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(javaProject);
                List<URL> urlList = new ArrayList<URL>();
                for (int i = 0; i < classPathEntries.length; i++) {
                    String entry = classPathEntries[i];
                    IPath path = new Path(entry);
                    URL url;
                    try {
                        url = path.toFile().toURI().toURL();
                        urlList.add(url);
                    } catch (MalformedURLException e) {
                        LOGGER.warn("Can't accept URL for '" + path + "': " + e.getMessage());
                    }
                }
                ClassLoader parentClassLoader = javaProject.getClass().getClassLoader();
                URL[] urls = (URL[]) urlList.toArray(new URL[urlList.size()]);
                URLClassLoader classLoader = new URLClassLoader(urls, parentClassLoader);
                loaders.add(classLoader);
            } catch (CoreException e) {
                LOGGER.warn("Can't handle project '" + project + "': " + e.getMessage());
            }
        }
        this.allLoaders = loaders;
    }

    @Override
    public List<URLClassLoader> getAllLoaders() {
        if (allLoaders == null)
            init();
        return allLoaders;
    }

    @Override
    public Class<?> loadClass(String name) {
        if (allLoaders == null)
            init();
        for (URLClassLoader loader : allLoaders) {
            try {
                return loader.loadClass(name);
            } catch (ClassNotFoundException ignore) {
            }
        }
        LOGGER.warn("Can't find class '" + name + "' in any loader " + allLoaders);
        return null;
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors(String name) {
        if (allLoaders == null)
            init();
        Class<?> beanClass = loadClass(name);
        if (beanClass == null)
            return null;

        // Look up any cached descriptors for this bean class
        PropertyDescriptor[] descriptors = null;
        // descriptors = (PropertyDescriptor[]) descriptorsCache.get(beanClass);
        // if (descriptors != null) {
        // return (descriptors);
        // }

        // Introspect the bean and cache the generated descriptors
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(beanClass);
        } catch (IntrospectionException e) {
            return (new PropertyDescriptor[0]);
        }
        descriptors = beanInfo.getPropertyDescriptors();
        if (descriptors == null) {
            descriptors = new PropertyDescriptor[0];
        }

        // descriptorsCache.put(beanClass, descriptors);
        return descriptors;
    }

    @Override
    public boolean isResolvePojo(EObject model) {
        if (!modelProperty.isDoResolvePojo(model)) {
            return false;
        }
        if (allLoaders == null) {
            init();
        }
        return allLoaders != null;
    }
}
