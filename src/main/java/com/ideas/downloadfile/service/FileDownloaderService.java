package com.ideas.downloadfile.service;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileDownloaderService {

    public File downloadFile(String filePath) {
        return new File(filePath);
    }
}
