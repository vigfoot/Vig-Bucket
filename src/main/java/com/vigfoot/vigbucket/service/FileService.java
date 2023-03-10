package com.vigfoot.vigbucket.service;

import com.vigfoot.vigbucket.vo.Bucket;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Service
public class FileService {


    @Lazy
    @PostConstruct
    void test() {
        File directory = Paths.get("C://").toFile();

        File[] files = directory.listFiles();

        if (files != null) Arrays.stream(files).forEach(file -> System.out.println(file.getName()));


    }

    public List<Bucket.File> getBucket(String directory) {


        return null;
    }
}