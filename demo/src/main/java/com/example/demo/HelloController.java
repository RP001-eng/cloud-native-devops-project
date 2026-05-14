package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> index() {
        return getSuccessResponse();
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return getSuccessResponse();
    }

    private Map<String, String> getSuccessResponse() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "DevOps Project Running Successfully");
        return response;
    }
}