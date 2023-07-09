package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/7/9 9:51
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
