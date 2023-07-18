package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 15:22
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
