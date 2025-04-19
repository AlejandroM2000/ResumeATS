package com.example.resumeATS.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ResumeController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadResume(@RequestParam("file") MultipartFile file){
        return "OK";
    }

    @RequestMapping(value = "/retrieve-ats-details", method = RequestMethod.GET)
    public String retrieveATSDetails(){
        return "100%";
    }

}
