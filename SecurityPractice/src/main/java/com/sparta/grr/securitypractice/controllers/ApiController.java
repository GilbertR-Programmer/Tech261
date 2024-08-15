package com.sparta.grr.securitypractice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    public String hello() {
        return "Hello Get!";
    }

    @GetMapping("/test")
    public String helloExtended() {
        return "Hello version 2";
    }

    @PostMapping
    public String helloPost() {
        return "Hello Post!";
    }

    @PutMapping
    public String helloPut() {
        return "Hello Put!";
    }

    @DeleteMapping
    public String helloDelete() {
        return "Hello Delete!";
    }
}
