package com.cclu.springframework.beans.factory.support;

import com.cclu.springframework.beans.BeansException;
import com.cclu.springframework.beans.factory.DisposableBean;
import com.cclu.springframework.beans.factory.config.SingleBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 13:57
 */
public class DefaultSingletonBeanRegistry implements SingleBeanRegistry {

    /**
     * Internal marker for a null singleton object:
     * used as marker value for concurrent Maps (which don't support null values).
     */
    protected static final Object NULL_OBJECT = new Object();

    private final Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        if (beanName == null || "".equals(beanName)) {
            throw new BeansException("参数错误");
        }
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object bean) {
        singletonObjects.put(beanName, bean);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }

    public void destroySingletons() {
        Set<String> keySet = this.disposableBeans.keySet();
        Object[] disposableBeanNames = keySet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object beanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }

}
