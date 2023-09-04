package com.cclu.springframework.context.event;

import com.cclu.springframework.beans.factory.BeanFactory;
import com.cclu.springframework.context.ApplicationEvent;
import com.cclu.springframework.context.ApplicationListener;

/**
 * @author ChangCheng Lu
 * @date 2023/9/4 10:00
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener applicationListener : getApplicationListeners(event)) {
            applicationListener.onApplicationEvent(event);
        }
    }
}
