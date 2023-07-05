package com.cclu.springframework.beans;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:11
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
