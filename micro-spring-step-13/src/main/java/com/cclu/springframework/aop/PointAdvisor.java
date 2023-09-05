package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 11:15
 */
public interface PointAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     *
     * @return Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
