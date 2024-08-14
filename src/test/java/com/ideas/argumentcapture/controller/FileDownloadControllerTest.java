package com.ideas.argumentcapture.controller;

import com.ideas.argumentcapture.service.FileDownloaderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = org.mockito.quality.Strictness.LENIENT)
class FileDownloadControllerTest {

    @Mock
    private FileDownloaderService downloaderService;

    @InjectMocks
    private FileDownloadController fileDownloadController;

    @Test
    void testDownloadFile() {
        File file = new File("test.txt");
        file.delete();
        when(downloaderService.downloadFile(file.getAbsolutePath())).thenReturn(file);
        boolean condition = fileDownloadController.downloadFile(file.getAbsolutePath());
        verify(downloaderService).downloadFile(file.getAbsolutePath());
        assertTrue(condition);
    }
}

