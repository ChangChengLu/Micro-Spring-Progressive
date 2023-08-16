package com.cclu.springframework.test;

import com.cclu.springframework.context.support.ClassPathXmlApplicationContext;
import com.cclu.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 13:50
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
