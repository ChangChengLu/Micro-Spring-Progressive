package com.cclu.springframework.context;

import com.cclu.springframework.beans.BeansException;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 12:50
 *
 * SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition
 * to the application context client methods in the
 * {@link com.cclu.springframework.context.ApplicationContext} interface.
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
