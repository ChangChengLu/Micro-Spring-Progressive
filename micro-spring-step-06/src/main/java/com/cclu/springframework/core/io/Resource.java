package com.cclu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 9:56
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
