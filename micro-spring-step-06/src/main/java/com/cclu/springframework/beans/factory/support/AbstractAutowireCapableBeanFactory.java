package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanException;
import cn.hutool.core.bean.BeanUtil;
import com.cclu.springframework.beans.PropertyValue;
import com.cclu.springframework.beans.PropertyValues;
import com.cclu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.BeanReference;
import lombok.Setter;

import java.lang.reflect.Constructor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/9 10:23
 */
@Setter
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object creatBean(String beanName, BeanDefinition beanDefinition, Object... args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
            applyBeanValues(beanName, bean, beanDefinition);
        } catch (Exception e) {
            throw new BeanException("Instantiation of bean failed", e);
        }
        return bean;
    }

    private Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            if (null != args && constructor.getParameterTypes().length == args.length) {
                constructorToUse = constructor;
            }
        }
        return instantiationStrategy.instantiate(beanName, beanDefinition, constructorToUse, args);
    }

    private void applyBeanValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue: propertyValues.getPropertyValues()) {
                String name = propertyValue.getBeanName();
                Object value = propertyValue.getValue();

                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }

                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {
            throw new BeanException("Error setting property values：" + beanName);
        }
    }
}
