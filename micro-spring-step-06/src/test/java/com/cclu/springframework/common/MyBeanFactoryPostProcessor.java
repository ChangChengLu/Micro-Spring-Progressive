package com.cclu.springframework.common;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.PropertyValue;
import com.cclu.springframework.beans.PropertyValues;
import com.cclu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/11 10:05
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：长承大律师事务所"));
    }
}
