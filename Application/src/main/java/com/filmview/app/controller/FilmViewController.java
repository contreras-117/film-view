package com.filmview.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmViewController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Millionaire";
    }
}
