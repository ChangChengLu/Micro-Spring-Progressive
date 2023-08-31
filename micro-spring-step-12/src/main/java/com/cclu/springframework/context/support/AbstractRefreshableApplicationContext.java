package com.cclu.springframework.context.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 15:17
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    /**
     * load all bean definitions
     * @param beanFactory
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

}
