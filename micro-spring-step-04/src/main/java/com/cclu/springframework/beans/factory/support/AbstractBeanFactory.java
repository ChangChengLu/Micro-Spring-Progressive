package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.exception.BeanException;
import com.cclu.springframework.beans.factory.BeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:37
 */
public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeanException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeanException {
        return doGetBean(beanName, args);
    }

    protected Object doGetBean(String beanName, Object... args) {
        Object singletonBean = getSingleton(beanName);
        if (singletonBean != null) {
            return singletonBean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object... args);

}
