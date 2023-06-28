package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 13:47
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
