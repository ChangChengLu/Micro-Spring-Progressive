package com.cclu.springframework.test.bean;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.BeanClassLoaderAware;
import com.cclu.springframework.beans.factory.BeanFactory;
import com.cclu.springframework.beans.factory.BeanFactoryAware;
import com.cclu.springframework.beans.factory.BeanNameAware;
import com.cclu.springframework.context.ApplicationContext;
import com.cclu.springframework.context.ApplicationContextAware;
import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 14:45
 */
@Data
public class UserService implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, ApplicationContextAware {

    private String uId;

    private String company;

    private String location;

    private UserDao userDao;

    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is：" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }
}
