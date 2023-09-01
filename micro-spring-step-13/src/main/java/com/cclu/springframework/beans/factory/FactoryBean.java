package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/9/1 8:06
 */
public interface FactoryBean<T> {

    /**
     * get object
     * @return
     * @throws Exception
     */
    T getObject() throws Exception;

    /**
     * get object type
     * @return
     */
    Class<?> getObjectType();

    /**
     * judge the object whether is the singleton
     * @return
     */
    boolean isSingleton();

}
