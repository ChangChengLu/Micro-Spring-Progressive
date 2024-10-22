package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import com.cclu.springframework.beans.factory.DisposableBean;
import lombok.AllArgsConstructor;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/9/1 9:17
 */
@AllArgsConstructor
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this(bean, beanName, beanDefinition.getDestroyMethodName());
    }

    @Override
    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        if (StrUtil.isNotBlank(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
