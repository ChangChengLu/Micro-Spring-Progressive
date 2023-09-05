package com.cclu.springframework.aop.framework;

import com.cclu.springframework.aop.AdvisedSupport;
import lombok.AllArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 11:19
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
