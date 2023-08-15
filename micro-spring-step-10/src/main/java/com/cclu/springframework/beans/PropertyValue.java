package com.cclu.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 10:50
 */
@Getter
@AllArgsConstructor
public class PropertyValue {

    private String name;

    private Object value;

}
