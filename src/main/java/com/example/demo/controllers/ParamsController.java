package com.example.demo.controllers;

import com.example.demo.dto.RequestParamDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {

    @GetMapping("/params/requestParams")
    public ResponseEntity requestParamTest(@RequestParam("id") String id, @RequestParam("name") String name) {
        return new ResponseEntity(new RequestParamDTO(id, name), HttpStatus.OK);
    }
}
