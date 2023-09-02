package com.cclu.springframework.context;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 9:15
 */
public interface ApplicationContextAware {

    /**
     * set application context of the bean
     * @param applicationContext
     * @throws BeansException
     */
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
