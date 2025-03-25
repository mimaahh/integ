package com.example.integapplication.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String getMethodName(@RequestParam (value="name") String name) {
        return String.format("Hello, &s", name);
    
}

@GetMapping("/home")
public String home() {
    return "/integrative_home.html";
}
}