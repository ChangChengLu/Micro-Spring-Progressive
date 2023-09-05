package com.cclu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:09
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);

}
