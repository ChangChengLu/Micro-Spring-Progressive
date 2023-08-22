package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 14:51
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;


}
