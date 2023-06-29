package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 10:49
 */
public interface BeanDefinitionRegistry {

    void registryBeanDefinition(String name, BeanDefinition beanDefinition);

}
