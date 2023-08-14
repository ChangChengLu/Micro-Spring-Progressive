package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.BeanPostProcessor;
import com.cclu.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 15:49
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    /**
     * get beanDefinition by beanName
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * such as XML files
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;

    /**
     * add beanPostProcessor to process the bean
     * @param beanPostProcessor
     */
    @Override
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
