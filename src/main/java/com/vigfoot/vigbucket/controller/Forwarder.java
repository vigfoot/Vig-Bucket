package com.vigfoot.vigbucket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class Forwarder {

    @GetMapping("/")
    public Mono<String> goIndex() {
        return Mono.just("index");
    }
}