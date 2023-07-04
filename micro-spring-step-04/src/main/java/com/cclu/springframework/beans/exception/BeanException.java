package com.cclu.springframework.beans.exception;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 10:25
 */
public class BeanException extends RuntimeException {

    public BeanException(String msg) {
        super(msg);
    }

    public BeanException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
