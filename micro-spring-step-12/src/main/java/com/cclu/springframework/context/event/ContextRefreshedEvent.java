package com.cclu.springframework.context.event;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 12:10
 *
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
