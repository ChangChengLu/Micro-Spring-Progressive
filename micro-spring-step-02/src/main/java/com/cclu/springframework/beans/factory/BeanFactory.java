package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.exception.BeanException;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 11:25
 */
public interface BeanFactory {

    Object getBean(String name) throws BeanException;

}
