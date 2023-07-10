package com.cclu.springframework.utils;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 10:04
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Exception e) {
            throw new RuntimeException();
        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
