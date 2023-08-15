package com.cclu.springframework.context.event;

import com.cclu.springframework.context.ApplicationContext;
import com.cclu.springframework.context.ApplicationEvent;

/**
 * @author ChangCheng Lu
 * @date 2023/8/15 15:25
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
