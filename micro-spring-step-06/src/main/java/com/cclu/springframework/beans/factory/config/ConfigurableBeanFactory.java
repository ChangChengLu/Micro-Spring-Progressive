package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 10:39
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
