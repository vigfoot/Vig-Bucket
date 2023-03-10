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

    public List<Bucket.File> getBucket(String dir) {
        File directory = Paths.get(dir).toFile();

        List<Bucket.File> files = new LinkedList<>();
        if (directory.listFiles() != null) {
            Arrays.stream(directory.listFiles())
                    .forEach(file -> {
                        files.add(Bucket.File.builder()
                                .name(file.getName())
                                .isDirectory(file.isDirectory())
                                .isEmpty(file.listFiles() == null)
                                .build()
                        );
                    });
        }

        return files;
    }
}