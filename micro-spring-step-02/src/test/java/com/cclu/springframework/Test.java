package com.cclu.springframework;

import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 14:46
 */
public class Test {

    @org.junit.Test
    public void testBeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(Student.class);
        beanFactory.registerBeanDefinition("student", beanDefinition);
        // 3.第一次获取 bean
        Student student = (Student) beanFactory.getBean("student");
        System.out.println(student);
        // 4.第二次获取 bean 单例模式
        Student studentSingleton = (Student) beanFactory.getBean("student");
        System.out.println(studentSingleton);
    }

}
