package com.hr.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    

    @GetMapping("/test")
    public String testing(){
        return "USER SERVICE API is working fine";
    }
}
