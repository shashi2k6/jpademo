package com.gal.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private TeaService teaService;

    @GetMapping("/api/tea")
    public String getAllTea(){
        return "";
    }
}
