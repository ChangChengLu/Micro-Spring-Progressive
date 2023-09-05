package com.cclu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:52
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;

}
