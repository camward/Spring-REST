package com.example.demo.controllers;

import com.example.demo.dto.RequestBodyDTO;
import com.example.demo.services.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {
    @Autowired
    private RequestBodyService requestBodyService;

    @PostMapping("/body")
    public ResponseEntity requestBodyTest(@RequestBody RequestBodyDTO requestBodyDTO) {
        return new ResponseEntity(requestBodyService.bodyTest(requestBodyDTO), HttpStatus.OK);
    }
}
