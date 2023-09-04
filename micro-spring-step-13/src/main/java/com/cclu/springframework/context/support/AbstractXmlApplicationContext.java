package com.cclu.springframework.context.support;

import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cclu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author ChangCheng Lu
 * @date 2023/9/4 11:36
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    /**
     * get config locations
     * @return
     */
    protected abstract String[] getConfigLocations();

}
