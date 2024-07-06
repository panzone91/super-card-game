package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {
    
    @GetMapping("/time")      
    public String getTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = localDateTime.toLocalTime();     // Era il metodo alternativo consigliato da Spring. Ha dei vantaggi il DateTime?
        String localTimeFormatted = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String saluto = "Ciao, sono le ore ";

        String message = saluto + localTimeFormatted;
        return message;
    }
}
