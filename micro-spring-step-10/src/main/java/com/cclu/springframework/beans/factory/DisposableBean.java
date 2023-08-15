package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 14:00
 */
public interface DisposableBean {
    /**
     * release the resource of the bean which implements this interface
     * @throws Exception
     */
    void destroy() throws Exception;
}
