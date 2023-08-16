package com.cclu.springframework.test.event;

import com.cclu.springframework.context.event.ApplicationContextEvent;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/16 13:45
 */
@Getter
@Setter
public class CustomEvent extends ApplicationContextEvent {

    private Long id;

    private String message;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source) {
        super(source);
    }

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }
}
