package com.codegym.service;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadFileService {
    public void uploadFile(MultipartFile file) throws IOException {
        String folderUpload = "D:\\Desktop\\CODE\\upload-file\\src\\main\\webapp\\uploadfile";
        String fileName = file.getOriginalFilename();
        FileCopyUtils.copy(file.getBytes(),new File(folderUpload+fileName));
    }
}
