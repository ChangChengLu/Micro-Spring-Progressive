package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 14:53
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
