package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/9/1 9:34
 */
public interface BeanClassLoaderAware {

    /**
     * set bean class loader
     * @param classLoader
     */
    void setBeanClassLoader(ClassLoader classLoader);

}
