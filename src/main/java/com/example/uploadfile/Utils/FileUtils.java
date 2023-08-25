package com.example.uploadfile.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    @Value("${file-upload}")
    private String fileUpload;
    public void saveFile(MultipartFile file) {
        try {
            FileCopyUtils.copy(file.getBytes(), new File( fileUpload + file.getOriginalFilename()));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
