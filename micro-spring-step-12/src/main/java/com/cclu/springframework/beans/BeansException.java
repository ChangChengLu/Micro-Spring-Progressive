package com.cclu.springframework.beans;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 11:44
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
