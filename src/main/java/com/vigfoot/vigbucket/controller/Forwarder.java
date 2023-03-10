package com.vigfoot.vigbucket.controller;

import com.vigfoot.vigbucket.service.FileService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

@Controller
@RequiredArgsConstructor
public class Forwarder {

    @Value("${dir}")
    public String directory;

    private final FileService fileService;

    @Lazy
    @PostConstruct
    void test() {
        Path path = Paths.get(directory);

        Set<String> fileStoreIterator = path.getFileSystem().supportedFileAttributeViews();
        for (String s : fileStoreIterator) {
            System.out.println(s);
        }
    }

    @GetMapping("/")
    Mono<String> goIndex(Model model) {

        model.addAttribute("directory", directory);

        return Mono.just("index");
    }
}