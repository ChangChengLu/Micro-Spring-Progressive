package com.cclu.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 9:58
 */
public class FileSystemResource implements Resource {

    private File file;

    private String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    public FileSystemResource(File file, String path) {
        this.file = file;
        this.path = path;
    }


    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

    public final String getPath() {
        return path;
    }
}
