package com.cclu.springframework;

/**
 * @author ChangCheng Lu
 * @date 2023/6/28 10:28
 */
public class Test {

    @org.junit.Test
    public static void main(String[] args) {
        // 1. 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册
        BeanDefinition beanDefinition = new BeanDefinition(new Student("lcc", 18, "nanjing "));
        beanFactory.registerBeanDefinition("Student", beanDefinition);

        // 3. 获取
        Student student = (Student) beanFactory.getBean("Student");
        System.out.println(student);
    }

}
