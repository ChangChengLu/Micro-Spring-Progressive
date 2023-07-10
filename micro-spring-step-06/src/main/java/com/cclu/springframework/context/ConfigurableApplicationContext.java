package com.cclu.springframework.context;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 20:48
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
