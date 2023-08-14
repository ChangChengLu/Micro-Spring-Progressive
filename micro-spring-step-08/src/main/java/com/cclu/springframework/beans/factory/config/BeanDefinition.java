package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.PropertyValues;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 13:59
 */
@Data
public class BeanDefinition {

    private Class<?> beanClass;

    @Setter(AccessLevel.NONE)
    private PropertyValues propertyValues;

    private String initMethod;

    private String destroyMethod;

    public BeanDefinition(Class<?> beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class<?> beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

}
