package com.sparta.grr.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //This is a Custom Component
public class CustomCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running that sweet command line runner");
    }
}
