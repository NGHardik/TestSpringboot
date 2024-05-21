package com.example.testProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
	@GetMapping("/message")
    public String getMessage() {
        return "Hello, world!";
    }
}
