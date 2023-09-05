package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:10
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
