package com.cclu.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 21:16
 *
 * 面向最底层（最上层），XML定义 Object
 */
@Getter
@AllArgsConstructor
public class PropertyValue {

    private String name;

    private Object value;

}
