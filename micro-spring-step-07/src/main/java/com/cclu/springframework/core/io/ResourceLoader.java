package com.cclu.springframework.core.io;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 20:30
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
