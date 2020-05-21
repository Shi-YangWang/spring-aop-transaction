package com.bunny.aop.controller;

import com.bunny.aop.service.FeedAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedAnimalController {
    @Autowired
    FeedAnimalService service;

    @GetMapping("/animal/feed")
    public String feed() throws Exception {
        service.feed();
        return "200 ok";
    }

    @GetMapping("/animal/pet")
    public String pet() throws Exception {
        service.pet();
        return "200 ok";
    }
}
