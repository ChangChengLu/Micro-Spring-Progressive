package com.cclu.springframework.core.io;

import com.sun.org.apache.bcel.internal.generic.IFLE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 8:22
 */
public class FileSystemResource implements Resource {

    private final File file;

    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.path = path;
        file = new File(path);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }
}
