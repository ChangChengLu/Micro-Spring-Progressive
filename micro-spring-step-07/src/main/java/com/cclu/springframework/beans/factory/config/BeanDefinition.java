package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.PropertyValues;
import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 14:48
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

}
