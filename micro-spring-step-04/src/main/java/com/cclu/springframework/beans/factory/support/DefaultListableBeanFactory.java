package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.exception.BeanException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 23:37
 */
@Getter
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeanException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
       beanDefinitionMap.put(beanName, beanDefinition);
    }
}
