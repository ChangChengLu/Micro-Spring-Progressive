package com.cclu.springframework;

import com.cclu.springframework.bean.IUserService;
import com.cclu.springframework.bean.UserService;
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

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    }

}
