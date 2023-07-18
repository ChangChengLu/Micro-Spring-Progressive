package com.cclu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/7/18 20:22
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
