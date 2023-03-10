package com.vigfoot.vigbucket.controller;

import com.vigfoot.vigbucket.service.FileService;
import com.vigfoot.vigbucket.vo.Bucket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final FileService fileService;

    @PostMapping
    List<Bucket.File> getBucket(@ModelAttribute String directory) {
        return fileService.getBucket(directory);
    }


}