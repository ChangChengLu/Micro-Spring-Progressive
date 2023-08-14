package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 14:16
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingleBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    /**
     * 添加后置处理器：构造器初始化后处理
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
