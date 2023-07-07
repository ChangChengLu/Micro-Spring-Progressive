package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/7/7 21:00
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
