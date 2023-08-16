package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 13:40
 */
public interface SingleBeanRegistry {

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
