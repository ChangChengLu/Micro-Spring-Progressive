package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanException;
import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:18
 */
public interface InstantiationStrategy {

    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor ctor, Object... args) throws BeansException;

}
