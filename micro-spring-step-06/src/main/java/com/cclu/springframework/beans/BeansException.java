package com.cclu.springframework.beans;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:11
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
