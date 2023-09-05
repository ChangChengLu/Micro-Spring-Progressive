package com.cclu.springframework.aop;

import lombok.AllArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:26
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
