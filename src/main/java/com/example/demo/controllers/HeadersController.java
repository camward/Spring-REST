package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadersController {

    @GetMapping("/headers")
    public ResponseEntity requestHeaderTest(@RequestHeader("TEST") String header) {
        return new ResponseEntity(header + "-renderer", HttpStatus.OK);
    }
}
