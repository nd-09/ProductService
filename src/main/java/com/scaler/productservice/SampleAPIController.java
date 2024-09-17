package com.scaler.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleAPIController {
    @GetMapping("/home")
    public String sample() {
        return "Welcome to Sample API";
    }
}
