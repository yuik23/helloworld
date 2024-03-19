package com.hello.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/greetings")
    public Map<String, String> greetings() {
        return Map.of(
                "おはようございます", "Good morning",
                "こんにちは", "Good evening",
                "こんばんは", "Good afternoon"
        );
    }

    @GetMapping("/responses")
    public HelloResponse helloResponse() {
        return new HelloResponse("こんにちは");
    }
}
