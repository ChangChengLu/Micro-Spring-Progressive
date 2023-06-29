package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 10:28
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
