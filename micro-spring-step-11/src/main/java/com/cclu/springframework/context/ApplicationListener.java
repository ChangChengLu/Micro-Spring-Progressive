package com.cclu.springframework.context;

import java.util.EventListener;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 12:16
 *
 * Interface to be implemented by application event listeners.
 * Based on the standard <code>java.util.EventListener</code> interface
 * for the Observer design pattern.
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
