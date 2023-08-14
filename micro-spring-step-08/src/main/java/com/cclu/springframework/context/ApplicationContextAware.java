package com.cclu.springframework.context;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.Aware;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 13:16
 */
public interface ApplicationContextAware extends Aware {

    /**
     * set application context of the bean
     * @param applicationContext
     * @throws BeansException
     */
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
