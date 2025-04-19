package com.example.resumeATS.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Service
public class PdfScannerService {

    private PDDocument pdDocument;

    public PdfScannerService(MultipartFile file) throws IOException {
        return;
    }

}
