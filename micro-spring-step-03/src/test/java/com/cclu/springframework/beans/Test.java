package com.cclu.springframework.beans;

import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/6/29 16:08
 */
public class Test {

    @org.junit.Test
    public void testBeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(Student.class);
        beanFactory.registryBeanDefinition("student", beanDefinition);

        // 3.获取bean
        Student student = (Student) beanFactory.getBean("student", "李四", 18, "上海");
        System.out.println(student);
    }

}
