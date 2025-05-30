package com.example.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StatusController {
    @Value("${app.env:Unknown}")
    private String env;

    @GetMapping("/status")
    public String getStatus() {
        return "Application running in: " + env;
    }
}
