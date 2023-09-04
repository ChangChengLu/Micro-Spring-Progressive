package com.cclu.springframework.context.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.BeanPostProcessor;
import com.cclu.springframework.context.ApplicationContext;
import com.cclu.springframework.context.ApplicationContextAware;
import lombok.AllArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/9/4 10:43
 */
@AllArgsConstructor
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
