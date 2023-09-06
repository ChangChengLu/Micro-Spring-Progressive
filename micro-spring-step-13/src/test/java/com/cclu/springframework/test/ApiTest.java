package com.cclu.springframework.test;

import com.cclu.springframework.context.support.ClassPathXmlApplicationContext;
import com.cclu.springframework.test.bean.IUserService;
import org.junit.Test;

/**
 * @author ChangCheng Lu
 * @date 2023/9/6 14:35
 */
public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
