package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.core.io.DefaultResourceLoader;
import com.cclu.springframework.core.io.ResourceLoader;
import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 12:30
 *
 *  Abstract base class for bean definition readers
 */
@AllArgsConstructor
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    @Setter
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}