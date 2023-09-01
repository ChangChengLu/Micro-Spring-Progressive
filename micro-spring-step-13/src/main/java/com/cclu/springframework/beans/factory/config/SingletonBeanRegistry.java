package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 21:38
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * register singleton bean
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);

}
