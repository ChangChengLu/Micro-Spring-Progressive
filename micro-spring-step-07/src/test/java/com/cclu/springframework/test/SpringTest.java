package com.cclu.springframework.test;

import com.cclu.springframework.context.support.ClassPathXmlApplicationContext;
import com.cclu.springframework.test.beans.UserService;
import org.junit.Test;

/**
 * @author ChangCheng Lu
 * @date 2023/7/19 13:48
 */
public class SpringTest {

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }

    @Test
    public void test_hook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("close！")));
    }


}
