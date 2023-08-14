package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 13:09
 *
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 *
 * 实现此接口，既能感知到所属的 BeanFactory
 */
public interface BeanFactoryAware extends Aware{

    /**
     * set beanFactory of the bean
     * @param beanFactory
     * @throws BeansException
     */
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
