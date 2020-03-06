package com.example.messagesservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessagesController {

    @GetMapping
    public String getAll(){
        return "Messages-Service up and working!!!";
    }


}
