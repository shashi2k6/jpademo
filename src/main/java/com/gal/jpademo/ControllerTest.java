package com.gal.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private TeaService teaService;

    @GetMapping("/api/tea")
    public String getAllTea(){
        return "";
    }

    @PostMapping("/api/tea")
    @ResponseStatus(HttpStatus.CREATED)
    public Tea createTea(){
        return new Tea();
    }
}
