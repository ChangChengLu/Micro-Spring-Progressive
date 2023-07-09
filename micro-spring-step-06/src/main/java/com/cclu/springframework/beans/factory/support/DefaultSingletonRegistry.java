package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/9 9:52
 */
public class DefaultSingletonRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        if (beanName == null || "".equals(beanName)) {
            throw new BeansException("Parameters do not allow to be null.");
        }
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object bean) {
        if (beanName == null || "".equals(beanName) || bean == null) {
            throw new BeansException("Parameters do not allow to be null.");
        }
        singletonObjects.put(beanName, bean);
    }
}
