package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {
    @GetMapping("/")
    public String getwelcometext(){
        return "Hello world";
    }
    @GetMapping("/suk")
    public String getMethodName() {
        return "Hey";
    }
    
}
