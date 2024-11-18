package com.example; // Ensure this matches your package structure
  
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
 
@SpringBootApplication
@RestController
 
public class App {
  
    public static void main(String[] args) {
 
        SpringApplication.run(App.class, args);
 
    }
 
    @GetMapping("/hello")

    public String hello() { 
        return "Hello, Banking Microservice!"; 
    } 
}
 
 