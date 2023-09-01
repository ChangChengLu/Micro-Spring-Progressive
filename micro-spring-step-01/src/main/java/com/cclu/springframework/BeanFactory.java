package com.cclu.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 10:12
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

}
