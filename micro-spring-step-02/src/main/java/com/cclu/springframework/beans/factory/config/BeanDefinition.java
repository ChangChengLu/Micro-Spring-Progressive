package com.cclu.springframework.beans.factory.config;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 11:07
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }
}
