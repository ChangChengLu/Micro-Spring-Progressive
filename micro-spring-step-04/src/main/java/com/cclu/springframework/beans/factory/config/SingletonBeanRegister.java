package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:13
 */
public interface SingletonBeanRegister {

    Object getSingleton(String beanName);

}
