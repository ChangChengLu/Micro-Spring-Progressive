package com.cclu.springframework.context;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 9:16
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * shut down the application
     */
    void registerShutdownHook();

    /**
     * close someone
     */
    void close();

}
