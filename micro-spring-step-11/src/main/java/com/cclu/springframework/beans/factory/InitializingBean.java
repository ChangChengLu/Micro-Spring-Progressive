package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 14:46
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
