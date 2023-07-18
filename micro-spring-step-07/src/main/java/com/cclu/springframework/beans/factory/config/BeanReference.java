package com.cclu.springframework.beans.factory.config;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 14:50
 */
@Data
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
