package com.example.demo.dto;

public class ResponseBody {
    private String nameWithID;

    public String getNameWithID() {
        return nameWithID;
    }

    public ResponseBody(String nameWithID) {
        this.nameWithID = nameWithID;
    }
}
