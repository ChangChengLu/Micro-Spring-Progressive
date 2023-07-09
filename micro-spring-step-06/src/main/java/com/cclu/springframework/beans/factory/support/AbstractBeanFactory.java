package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.BeanFactory;
import com.cclu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChangCheng Lu
 * @date 2023/7/9 10:05
 */
public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory  {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String beanName, Class<T> requireType) throws BeansException {
        return (T) getBean(beanName);
    }

    protected <T> T doGetBean(String beanName, Object... args) {
        // 此处逻辑不做校验也可以，因为在 getSingleton 中已经做过校验了
        // 但是在实际业务项目开发中，推荐做校验，防止忘记（也可能是别人开发组件，不知道做没做）
//        if (beanName == null || "".equals(beanName)) {
//            throw new BeansException("Parameters do not allow to be null.");
//        }
        Object singleton = getSingleton(beanName);
        if (singleton != null) {
            return (T) singleton;
        }

        return null;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    /**
     *
     * @param beanName 标识，方便拓展，抛出异常
     * @param beanDefinition 获取 beanClass, propertyValues
     * @param args 参数初始化
     * @return
     */
    protected abstract Object creatBean(String beanName, BeanDefinition beanDefinition, Object... args);

}
