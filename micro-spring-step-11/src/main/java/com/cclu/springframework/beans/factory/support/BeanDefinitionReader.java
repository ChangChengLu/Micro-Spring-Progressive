package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.core.io.Resource;
import com.cclu.springframework.core.io.ResourceLoader;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 14:54
 */
public interface BeanDefinitionReader {

    /**
     * get beanObj which implement the interface BeanDefinitionRegistry
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * get resource loader
     * @return
     */
    ResourceLoader getResourceLoader();

    /**
     * load bean definition from resource
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    /**
     * load bean definition from resources
     * @param resources
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource... resources) throws BeansException;

    /**
     * load bean definition from file
     * @param location
     * @throws BeansException
     */
    void loadBeanDefinitions(String location) throws BeansException;

    /**
     * load bean definition from files
     * @param locations
     * @throws BeansException
     */
    void loadBeanDefinitions(String... locations) throws BeansException;

}
