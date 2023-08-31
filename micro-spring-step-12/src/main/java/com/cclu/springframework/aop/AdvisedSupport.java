package com.cclu.springframework.aop;

import lombok.*;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author ChangCheng Lu
 * @date 2023/8/25 21:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvisedSupport {

    private boolean proxyTargetClass = false;

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

}
