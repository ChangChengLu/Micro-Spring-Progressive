package com.cclu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 8:21
 */
public interface Resource {

    /**
     * get file inputStream
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;

}
