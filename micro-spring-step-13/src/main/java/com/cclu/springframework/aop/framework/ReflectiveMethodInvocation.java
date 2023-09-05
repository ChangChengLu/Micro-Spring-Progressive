package com.cclu.springframework.aop.framework;

import lombok.AllArgsConstructor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:32
 */
@AllArgsConstructor
public class ReflectiveMethodInvocation implements MethodInvocation {

    protected final Object target;

    protected final Method method;

    protected Object[] arguments;


    @Override
    public Method getMethod() {
        return method;
    }

    @Override
    public Object[] getArguments() {
        return arguments;
    }

    @Override
    public Object proceed() throws Throwable {
        return method.invoke(target, arguments);
    }

    @Override
    public Object getThis() {
        return this;
    }

    @Override
    public AccessibleObject getStaticPart() {
        return method;
    }
}
