package com.cclu.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author ChangCheng Lu
 * @date 2023/9/6 13:38
 *
 * Indicates that an annotated class is a "component".
 * Such classes are considered as candidates for auto-detection
 * when using annotation-based configuration and classpath scanning.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
