package org.sqlproc.dsl.ui.resolver;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.resolver.PojoResolver;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class WorkspacePojoResolverImpl implements PojoResolver {

    protected Logger LOGGER = Logger.getLogger(WorkspacePojoResolverImpl.class);

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
                URLClassLoader classLoader = getProjectClassLoader(javaProject);
                loaders.add(classLoader);
            } catch (CoreException e) {
                LOGGER.warn("Can't handle project '" + project + "': " + e.getMessage());
            }
        }
        this.allLoaders = loaders;
    }

    @SuppressWarnings("unused")
    private URLClassLoader getProjectClassLoader(IJavaProject javaProject) throws CoreException {
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
        return classLoader;
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

    @Override
    public List<Class<?>> getPojoClasses() {
        List<Class<?>> pojos = new ArrayList<Class<?>>();
        IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        if (editorPart != null) {
            IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
            IProject project = input.getFile().getProject();
            try {
                project.open(null /* IProgressMonitor */);
                IJavaProject javaProject = JavaCore.create(project);
                URLClassLoader classLoader = getProjectClassLoader(javaProject);

                for (IPackageFragment fragment : javaProject.getPackageFragments()) {
                    if (fragment.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        for (ICompilationUnit unit : fragment.getCompilationUnits()) {
                            if (unit.getTypes() != null && unit.getTypes().length > 0) {
                                String classname = unit.getParent().getElementName() + "."
                                        + unit.getTypes()[0].getElementName();
                                // Class<?> clazz = loadClass(classname);
                                Class<?> clazz = null;
                                try {
                                    clazz = classLoader.loadClass(classname);
                                } catch (ClassNotFoundException ignore) {
                                }
                                if (clazz == null)
                                    continue;
                                for (Annotation annotation : clazz.getAnnotations()) {
                                    if (POJO_ANNOTATION_CLASS.equals(annotation.annotationType().getName())) {
                                        pojos.add(clazz);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (CoreException e) {
                LOGGER.warn("Can't handle project '" + project + "': " + e.getMessage());
            }
        }
        return pojos;
    }

    // 0000000a org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl@d452db (name: person, table: PERSON)
    // 0000000b org.eclipse.xtext.linking.lazy.LazyLinkingResource@1386e14
    // uri='platform:/resource/simple-jdbc-all/src/main/resources/definitions.qry'
    // 0000000c platform:/resource/simple-jdbc-all/src/main/resources/definitions.qry
    // 0000000d R/
    // 0000000e /simple-jdbc-all/src/main/resources/definitions.qry
    // 0000000f /simple-jdbc-all/src/main/resources/definitions.qry
    // 0000000g L/simple-jdbc-all/src/main/resources/definitions.qry
    // 0000000h F/simple-jdbc-all/src/main/resources
    // 0000000i F/simple-jdbc-all/src/main/resources
    // 0000000j L/simple-jdbc-all/src/main/resources/hsqldb.ddl

    @Override
    public InputStream getFile(EObject model, String filename) {
        Resource resource = model.eResource();
        URI uri = resource.getURI();
        if (uri.isPlatformResource()) {
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IFile modelFile = root.getFile(new Path(uri.toPlatformString(false)));
            IContainer modelParent = modelFile.getParent();
            if (modelParent instanceof IFolder) {
                IFolder modelDir = (IFolder) modelParent;
                IFile file = modelDir.getFile(filename);
                try {
                    return file.getContents();
                } catch (CoreException e) {
                    LOGGER.warn("Can't handle file '" + filename + "': " + e.getMessage());
                }
            }
        }
        LOGGER.warn("Can't find file '" + filename + "' in project");
        return null;
    }
}
