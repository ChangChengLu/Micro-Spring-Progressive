package com.cclu.springframework.context.event;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 12:05
 *
 * Event raised when an <code>ApplicationContext</code> gets closed.
 */
public class ContextClosedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
