package com.cclu.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 11:46
 */
@Data
@AllArgsConstructor
public class PropertyValue {

    private String name;

    private Object value;

}
