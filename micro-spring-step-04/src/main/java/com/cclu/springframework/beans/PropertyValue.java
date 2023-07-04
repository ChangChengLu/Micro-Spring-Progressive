package com.cclu.springframework.beans;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 21:22
 */
@Data
public class PropertyValue {

    private String name;

    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

}
