package com.cclu.springframework.aop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 10:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvisedSupport {

    /**
     * false: JDK true: cglib
     */
    private boolean proxyTargetClass = false;

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

}
