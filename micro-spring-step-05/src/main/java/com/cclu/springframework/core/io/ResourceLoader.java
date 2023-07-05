package com.cclu.springframework.core.io;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 17:57
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
