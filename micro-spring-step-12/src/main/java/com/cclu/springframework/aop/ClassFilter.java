package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/8/23 15:49
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);

}
