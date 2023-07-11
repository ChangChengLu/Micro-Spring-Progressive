package com.cclu.springframework.common;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.UserService;
import com.cclu.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ChangCheng Lu
 * @date 2023/7/11 10:05
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
