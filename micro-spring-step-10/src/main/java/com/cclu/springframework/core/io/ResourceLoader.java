package com.cclu.springframework.core.io;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 16:27
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * return resource
     * @param location
     * @return
     */
    Resource getResource(String location);

}
