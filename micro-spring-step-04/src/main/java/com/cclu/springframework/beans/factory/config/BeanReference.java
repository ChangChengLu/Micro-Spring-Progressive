package com.cclu.springframework.beans.factory.config;

import lombok.Data;
import lombok.Getter;

/**
 * @author ChangCheng Lu
 * @date 2023/7/4 23:22
 */
@Getter
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

}
