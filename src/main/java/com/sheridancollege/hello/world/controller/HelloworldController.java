package com.sheridancollege.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String getHelloWorld()
    {
        return "Hello World created by Swati Patel";
    }

}
