package com.vigfoot.vigbucket.controller;

import com.vigfoot.vigbucket.service.FileService;
import com.vigfoot.vigbucket.vo.Bucket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final FileService fileService;

    @PostMapping("/bucket")
    List<Bucket.File> getBucket(@RequestBody String directory) {
        return fileService.getBucket(directory);
    }
}