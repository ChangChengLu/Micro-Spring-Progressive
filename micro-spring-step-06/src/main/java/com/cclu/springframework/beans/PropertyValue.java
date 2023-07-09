package com.cclu.springframework.beans;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/9 9:44
 */
@Data
public class PropertyValue {

    private String beanName;

    private Object value;

    public PropertyValue(String beanName, Object value) {
        this.beanName = beanName;
        this.value = value;
    }
}
