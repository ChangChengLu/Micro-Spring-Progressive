package com.cclu.springframework.aop.framework;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 14:08
 *
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects.
 *
 * <p>Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 *
 * AOP 代理的抽象
 *
 * <p>
 */
public interface AopProxy {

    /**
     * get proxy for the target
     * @return
     */
    Object getProxy();

}
