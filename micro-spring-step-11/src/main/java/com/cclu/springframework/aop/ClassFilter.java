package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 12:39
 *
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 */
public interface ClassFilter {

    /**
     * Should the pointcut apply to the given interface or target class?
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);

}
