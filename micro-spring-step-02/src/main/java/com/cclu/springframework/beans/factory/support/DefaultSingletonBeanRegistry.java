package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 11:19
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegister {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
