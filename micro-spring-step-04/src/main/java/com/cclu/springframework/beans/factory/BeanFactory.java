package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.exception.BeanException;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 22:34
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeanException;

    Object getBean(String beanName, Object... args) throws BeanException;

}
