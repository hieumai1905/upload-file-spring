package com.example.uploadfile;

import com.example.uploadfile.Utils.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UploadFile {
    @ModelAttribute("upload")
    public Upload initFile() {
        return new Upload();
    }

    @GetMapping("/upload")
    public String uploadFile() {
        return "index";
    }

    @PostMapping("/upload")
    public String uploadfile(@ModelAttribute("upload") Upload upload) {
        FileUtils fileUtils = new FileUtils();
        fileUtils.saveFile(upload.getFile());
        return "index";
    }
}
