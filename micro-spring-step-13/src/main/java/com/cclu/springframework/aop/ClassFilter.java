package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:09
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);

}
