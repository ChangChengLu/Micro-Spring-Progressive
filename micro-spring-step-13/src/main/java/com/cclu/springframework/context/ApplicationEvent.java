package com.cclu.springframework.context;

import java.util.EventObject;

/**
 * @author ChangCheng Lu
 * @date 2023/9/3 9:26
 */
public class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
