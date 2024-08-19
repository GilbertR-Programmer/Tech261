package com.sparta.grr.webclientapi.controllers;

import com.sparta.grr.webclientapi.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api")
public class SimpleApiCallController {

    private final WebClient webClient;

    @Autowired
    public SimpleApiCallController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/")
    public String welcome(){
        return webClient.get().uri("postcodes/g115hh")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @GetMapping("/advanced")
    public ResponseEntity<Response> advanced(){
        return webClient.get()
                .uri("postcodes/g115hh")
                .retrieve()
                .bodyToMono(Response.class)
                .map(ResponseEntity::ok)
                .block();
    }
}
