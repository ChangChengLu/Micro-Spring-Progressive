package com.cclu.springframework;

import com.cclu.springframework.aop.MethodMatcher;
import com.cclu.springframework.aop.aspectj.AspectJExpressionPointcut;
import com.cclu.springframework.aop.framework.ReflectiveMethodInvocation;
import com.cclu.springframework.bean.IUserService;
import com.cclu.springframework.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 12:27
 */
public class FrameworkTest {

    @Test
    public void test_proxy_method() {
        Object targetObj = new UserService();
        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetObj.getClass().getInterfaces(), new InvocationHandler() {

            MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* com.cclu.springframework.bean.IUserService.*(..))");

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methodMatcher.matches(method, targetObj.getClass())) {
                    // 方法拦截器
                    MethodInterceptor methodInterceptor = invocation -> {
                        long start = System.currentTimeMillis();
                        try {
                            return invocation.proceed();
                        } finally {
                            System.out.println("监控 - Begin By AOP");
                            System.out.println("方法名称：" + invocation.getMethod().getName());
                            System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
                            System.out.println("监控 - End\r\n");
                        }
                    };
                    // 反射调用
                    return methodInterceptor.invoke(new ReflectiveMethodInvocation(targetObj, method, args));
                }
                return method.invoke(targetObj, args);
            }
        });

        String result = proxy.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

}
