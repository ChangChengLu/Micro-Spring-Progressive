package com.cclu.springframework.aop;

import lombok.AllArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/8/25 21:11
 */
@AllArgsConstructor
public class TargetSource {

    private final Object target;

    public Class<?>[] getTargetClass() {
        return target.getClass().getInterfaces();
    }

    public Object getTarget() {
        return target;
    }
}
