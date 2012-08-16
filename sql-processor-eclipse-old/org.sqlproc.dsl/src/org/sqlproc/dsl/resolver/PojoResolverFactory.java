package org.sqlproc.dsl.resolver;

public interface PojoResolverFactory {

    PojoResolver getPojoResolver();

    void setPojoResolver(PojoResolver pojoResolver);

}
