package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/8/25 20:46
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
