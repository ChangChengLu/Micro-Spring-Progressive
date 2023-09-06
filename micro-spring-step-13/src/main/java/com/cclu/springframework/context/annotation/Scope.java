package com.cclu.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author ChangCheng Lu
 * @date 2023/9/6 13:36
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}
