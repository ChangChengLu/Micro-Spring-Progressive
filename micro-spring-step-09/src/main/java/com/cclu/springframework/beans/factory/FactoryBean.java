package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/14 13:23
 *
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 * @param <T>
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
