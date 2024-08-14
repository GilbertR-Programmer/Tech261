package com.sparta.grr.securitypractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/").setViewName("welcome");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/login").setViewName("login");
    }
}
