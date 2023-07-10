package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.core.io.Resource;
import com.cclu.springframework.core.io.ResourceLoader;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 20:14
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
