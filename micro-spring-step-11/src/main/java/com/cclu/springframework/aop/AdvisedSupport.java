package com.cclu.springframework.aop;

import lombok.Data;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 13:57
 *
 * Base class for AOP proxy configuration managers.
 * These are not themselves AOP proxies, but subclasses of this class are
 * normally factories from which AOP proxy instances are obtained directly.
 */
@Data
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

}