package com.cclu.springframework.beans.factory.config;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:12
 */
@Data
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

}
