package com.cclu.springframework.beans.exception;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 11:28
 */
public class BeanException extends RuntimeException {
    public BeanException() {

    }

    public BeanException(String msg) {
        super(msg);
    }

    public BeanException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
