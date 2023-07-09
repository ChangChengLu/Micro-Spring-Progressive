package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanException;
import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:19
 */
public class JdkInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor ctor, Object... args) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            if (null != ctor) {
                return beanClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance();
            } else {
                return beanClass.getDeclaredConstructor().newInstance();
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new BeanException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
