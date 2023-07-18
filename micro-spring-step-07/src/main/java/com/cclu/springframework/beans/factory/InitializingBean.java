package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 15:13
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}