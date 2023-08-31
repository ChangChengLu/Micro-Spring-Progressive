package com.cclu.springframework.aop.framework.adapter;

import com.cclu.springframework.aop.MethodBeforeAdvice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 15:56
 *
 * Interceptor to wrap am {@link com.cclu.springframework.aop.MethodBeforeAdvice}.
 * Used internally by the AOP framework; application developers should not need
 * to use this class directly.
 */
@NoArgsConstructor
@AllArgsConstructor
public class MethodBeforeAdviceInterceptor implements MethodInterceptor {

    private MethodBeforeAdvice advice;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        advice.before(invocation.getMethod(), invocation.getArguments(), invocation.getThis());
        return invocation.proceed();
    }
}
