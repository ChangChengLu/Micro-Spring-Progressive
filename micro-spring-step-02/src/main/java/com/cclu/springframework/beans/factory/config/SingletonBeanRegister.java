package com.cclu.springframework.beans.factory.config;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 11:15
 */
public interface SingletonBeanRegister {

    Object getSingleton(String name);

}
