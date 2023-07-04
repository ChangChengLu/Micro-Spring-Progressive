package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 23:37
 */
public interface BeanDefinitionRegistry {

    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
