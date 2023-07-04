package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.exception.BeanException;
import com.cclu.springframework.beans.factory.config.SingletonBeanRegister;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:16
 */
@Data
public class DefaultSingletonRegistry implements SingletonBeanRegister {

    private Map<String, Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        if (beanName == null || "".equals(beanName)) {
            throw new BeanException("Parameters do not allow to be null.");
        }
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object bean) {
        if (beanName == null || "".equals(beanName) || bean == null) {
            throw new BeanException("Parameters do not allow to be null.");
        }

        singletonObjects.put(beanName, bean);
    }

}
