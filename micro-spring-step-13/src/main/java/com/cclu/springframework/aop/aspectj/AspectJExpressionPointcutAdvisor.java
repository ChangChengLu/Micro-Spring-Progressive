package com.cclu.springframework.aop.aspectj;

import com.cclu.springframework.aop.PointAdvisor;
import com.cclu.springframework.aop.Pointcut;
import lombok.Setter;
import org.aopalliance.aop.Advice;

/**
 * @author ChangCheng Lu
 * @date 2023/9/5 11:14
 *
 * Spring AOP Advisor that can be used for any AspectJ pointcut expression.
 */
@Setter
public class AspectJExpressionPointcutAdvisor implements PointAdvisor {

    private AspectJExpressionPointcut pointcut;

    /**
     * 具体被拦截的方法
     */
    private Advice advice;

    private String expression;

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            return new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

}
