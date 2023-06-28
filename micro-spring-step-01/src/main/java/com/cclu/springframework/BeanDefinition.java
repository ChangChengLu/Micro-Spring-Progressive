package com.cclu.springframework;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 10:10
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
