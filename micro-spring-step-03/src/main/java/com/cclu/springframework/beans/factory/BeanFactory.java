package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.exception.BeanException;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 10:27
 */
public interface BeanFactory {

    /**
     * 无参
     * @param beanName
     * @return
     */
    Object getBean(String beanName) throws BeanException;

    /**
     * 含参
     * @param beanName
     * @param args
     * @return
     */
    Object getBean(String beanName, Object... args) throws BeanException;

}
