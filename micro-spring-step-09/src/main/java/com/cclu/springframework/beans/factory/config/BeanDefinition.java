package com.cclu.springframework.beans.factory.config;

import com.cclu.springframework.beans.PropertyValues;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 13:59
 */
@Data
public class BeanDefinition {

    final String SCOPE_SINGLETON = ConfigurableBeanFactory.SCOPE_SINGLETON;

    final String SCOPE_PROTOTYPE = ConfigurableBeanFactory.SCOPE_PROTOTYPE;

    private Class<?> beanClass;

    @Setter(AccessLevel.NONE)
    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    @Getter(AccessLevel.NONE)
    private String scope = SCOPE_SINGLETON;

    private boolean singleton = true;

    private boolean prototype = false;

    public BeanDefinition(Class<?> beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class<?> beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public void setScope(String scope) {
        this.scope = scope;
        singleton = SCOPE_SINGLETON.equals(scope);
        prototype = SCOPE_PROTOTYPE.equals(scope);
    }

}
