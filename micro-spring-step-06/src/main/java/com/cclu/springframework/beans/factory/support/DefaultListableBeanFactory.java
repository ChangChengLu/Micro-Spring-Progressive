package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanException;
import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 10:42
 */
@Getter
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry, ConfigurableListableBeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        if (beanName == null || "".equals(beanName)) {
            throw new BeansException("The parameters are not allowed to be null.");
        }
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeanException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }

    @Override
    public <T> Map<String, T> getBeanOfType(Class<T> type) {
        Map<String, T> result = new HashMap<>();
        beanDefinitionMap.forEach((beanName, beanDefinition) -> {
            Class beanClass = beanDefinition.getBeanClass();
            if (beanClass.isAssignableFrom(type)) {
                result.put(beanName, (T) getBean(beanName));
            }
        });

        return null;
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
