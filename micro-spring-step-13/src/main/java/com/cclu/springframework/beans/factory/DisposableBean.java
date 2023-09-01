package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 21:43
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
