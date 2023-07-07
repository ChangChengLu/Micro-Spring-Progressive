package com.cclu.springframework.utils;

/**
 * @author ChangCheng Lu
 * @date 2023/7/7 20:45
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
            cl = ClassLoader.class.getClassLoader();
        }
        return cl;
    }

}
