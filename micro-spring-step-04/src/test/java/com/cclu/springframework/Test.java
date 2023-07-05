package com.cclu.springframework;

import com.cclu.springframework.beans.PropertyValue;
import com.cclu.springframework.beans.PropertyValues;
import com.cclu.springframework.beans.UserDao;
import com.cclu.springframework.beans.UserService;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.config.BeanReference;
import com.cclu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 9:26
 */
public class Test {

    @org.junit.Test
    public void test() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. 注册 UserDao
        beanFactory.registryBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 3. 设置 UserService 初始化属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "1001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        // 4. 注册 UserService
        beanFactory.registryBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));
        // 5. 通过 工厂 获取 UserService
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
