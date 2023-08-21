package com.cclu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 12:43
 *
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @param method
     * @param targetClass
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);

}
