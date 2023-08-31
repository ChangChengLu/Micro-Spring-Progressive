package com.cclu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/8/23 15:49
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);

}
