package com.cclu.springframework.beans;

import lombok.Getter;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 14:45
 */
@Getter
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

}
