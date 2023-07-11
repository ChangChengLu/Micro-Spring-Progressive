package com.cclu.springframework.context.support;

import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cclu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author ChangCheng Lu
 * @date 2023/7/11 9:17
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
