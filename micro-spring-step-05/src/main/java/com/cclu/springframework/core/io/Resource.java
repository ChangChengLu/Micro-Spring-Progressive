package com.cclu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 13:40
 */
public interface Resource {

    InputStream getInputSteam() throws IOException;

}
