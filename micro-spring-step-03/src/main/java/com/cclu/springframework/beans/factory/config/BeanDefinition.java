package com.cclu.springframework.beans.factory.config;

import lombok.Data;

import java.util.Calendar;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 10:29
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

}
