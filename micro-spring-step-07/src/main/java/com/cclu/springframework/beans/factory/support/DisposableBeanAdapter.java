package com.cclu.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.DisposableBean;
import com.cclu.springframework.beans.factory.config.BeanDefinition;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 20:08
 */
@Data
public class DisposableBeanAdapter implements DisposableBean {

    private final String beanName;

    private final Object bean;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        // 2. 注解配置 destroy-method {判断是为了避免二次执行销毁}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
