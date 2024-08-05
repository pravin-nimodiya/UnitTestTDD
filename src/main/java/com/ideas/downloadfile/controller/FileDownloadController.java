package com.ideas.downloadfile.controller;

import com.ideas.downloadfile.service.FileDownloaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileDownloadController {

    @Autowired
    private FileDownloaderService downloaderService;

    public boolean downloadFile(String filePath) {
        if(!new File(filePath).exists()){
            return downloaderService.downloadFile(filePath).exists();
        }
        return true;
    }
}
