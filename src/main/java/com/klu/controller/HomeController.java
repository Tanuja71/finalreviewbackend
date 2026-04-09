package com.klu.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
                "message", "Backend is running successfully",
                "status", 200
        );
    }

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
                "message", "Application is healthy",
                "status", 200
        );
    }
}