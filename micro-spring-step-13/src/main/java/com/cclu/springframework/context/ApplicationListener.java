package com.cclu.springframework.context;

import java.util.EventListener;

/**
 * @author ChangCheng Lu
 * @date 2023/9/3 9:42
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
