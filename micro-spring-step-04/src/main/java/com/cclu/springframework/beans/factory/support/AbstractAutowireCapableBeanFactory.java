package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.cclu.springframework.beans.PropertyValue;
import com.cclu.springframework.beans.PropertyValues;
import com.cclu.springframework.beans.exception.BeanException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.BeanReference;
import lombok.Data;

import java.lang.reflect.Constructor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 23:09
 */
@Data
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object... args) {
        Object bean = null;
        try {
            // 实例化 bean
            bean = createBeanInstance(beanName, beanDefinition, args);
            // 注意属性和依赖对象
            applyBeanValues(beanName, bean, beanDefinition);
        } catch (Exception e) {
            throw new BeanException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object... args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (null != args && constructor.getParameterTypes().length == args.length) {
                constructorToUse = constructor;
            }
        }
        return getInstantiationStrategy().instantiate(beanName, beanDefinition, constructorToUse, args);
    }

    protected void applyBeanValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanName);
                }

                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {
            throw new BeanException("Error setting property values：" + beanName);
        }
    }

}
