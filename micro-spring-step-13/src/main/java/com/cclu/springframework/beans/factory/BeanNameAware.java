package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 21:28
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String beanName);
}
