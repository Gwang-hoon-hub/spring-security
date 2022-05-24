package com.pang.springsecurity.controller;

import org.atmosphere.config.service.Get;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LoginController {

    @GetMapping("/health")
    public ResponseEntity health(){
        return new ResponseEntity(HttpStatus.OK);
    }

}
