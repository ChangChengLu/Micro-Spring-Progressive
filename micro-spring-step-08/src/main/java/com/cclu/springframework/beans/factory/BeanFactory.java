package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 14:10
 */
public interface BeanFactory {

    /**
     * 根据名称获取对象
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和构造参数获取对象
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 根据所需要类型获取对象（接口，继承关系）
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
