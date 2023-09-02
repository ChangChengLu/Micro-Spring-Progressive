package com.cclu.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 8:35
 */
public class DefaultResourceLoader implements ResourceLoader {
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if (location.startsWith(ResourceLoader.CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(ResourceLoader.CLASSPATH_URL_PREFIX.length()));
        }
        try {
            URL url = new URL(location);
            return new UrlResource(url);
        } catch (MalformedURLException e) {
            return new FileSystemResource(location);
        }
    }
}
