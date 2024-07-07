package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {
    
    @GetMapping("/time")      
    public String getTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String localTimeFormatted = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        String greetings = ("Hello! It is: ");

        return greetings + localTimeFormatted;
    }

}


