package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.PropertyValue;
import com.cclu.springframework.beans.PropertyValues;
import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:10
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

}
