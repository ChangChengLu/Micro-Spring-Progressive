package com.cclu.springframework.beans;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 10:50
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
