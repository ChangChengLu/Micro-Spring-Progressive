package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.exception.BeanException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:46
 */
public interface InstantiationStrategy {

    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor ctor, Object... args) throws BeanException;

}
