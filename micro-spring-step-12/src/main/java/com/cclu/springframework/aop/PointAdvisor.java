package com.cclu.springframework.aop;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 15:44
 *
 * Superinterface for all Advisors that are driven by a pointcut.
 * This covers nearly all advisors except introduction advisors,
 * for which method-level matching doesn't apply.
 *
 * PointcutAdvisor 承担了 Pointcut 和 Advice 的组合，Pointcut 用于获取 JoinPoint，而 Advice 决定于 JoinPoint 执行什么操作。
 */
public interface PointAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     *
     * @return Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
