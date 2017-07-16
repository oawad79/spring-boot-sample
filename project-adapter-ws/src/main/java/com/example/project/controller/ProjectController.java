package com.example.project.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProjectController {

    @RequestMapping("/hello/{what}")
    public String hello(@PathVariable final String what) {
        return "Hello " + what + "!";
    }

}
