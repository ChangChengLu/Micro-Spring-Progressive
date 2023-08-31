package com.cclu.springframework.context.event;

import com.cclu.springframework.beans.factory.BeanFactory;
import com.cclu.springframework.context.ApplicationEvent;
import com.cclu.springframework.context.ApplicationListener;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 13:25
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
