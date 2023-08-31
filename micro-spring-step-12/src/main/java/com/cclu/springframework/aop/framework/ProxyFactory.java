package com.cclu.springframework.aop.framework;

import com.cclu.springframework.aop.AdvisedSupport;
import lombok.AllArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 16:12
 *
 * Factory for AOP proxies for programmatic use, rather than via a bean
 * factory. This class provides a simple way of obtaining and configuring
 * AOP proxies in code.
 */
@AllArgsConstructor
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }

}
