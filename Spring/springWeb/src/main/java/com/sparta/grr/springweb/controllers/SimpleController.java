package com.sparta.grr.springweb.controllers;

import org.hibernate.query.sqm.TemporalUnit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@Controller
@RequestMapping()
public class SimpleController {

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
        return "welcome";
    }
}
