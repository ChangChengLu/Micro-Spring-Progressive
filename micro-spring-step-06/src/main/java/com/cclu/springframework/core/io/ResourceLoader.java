package com.cclu.springframework.core.io;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 10:17
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
