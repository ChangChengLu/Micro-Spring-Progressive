package com.cclu.springframework.context.event;

import com.cclu.springframework.context.ApplicationEvent;
import com.cclu.springframework.context.ApplicationListener;

/**
 * @author ChangCheng Lu
 * @date 2023/9/3 13:22
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}
