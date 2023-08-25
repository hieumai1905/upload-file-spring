package com.example.uploadfile;

import org.springframework.web.multipart.MultipartFile;

public class Upload {
    private MultipartFile file;

    public Upload() {
    }

    public Upload(MultipartFile file) {
        this.file = file;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
