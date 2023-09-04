package com.cclu.springframework.context.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/9/4 11:00
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    /**
     * load
     * @param beanFactory DefaultListableBeanFactory
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);
}
