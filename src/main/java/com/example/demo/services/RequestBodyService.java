package com.example.demo.services;

import com.example.demo.dto.RequestBodyDTO;
import com.example.demo.dto.ResponseBody;
import org.springframework.stereotype.Service;

@Service
public class RequestBodyService {

    public ResponseBody bodyTest(RequestBodyDTO requestBodyDTO) {
        String nameWithID = requestBodyDTO.getId() + ". " + requestBodyDTO.getName();
        return new ResponseBody(nameWithID);
    }
}
