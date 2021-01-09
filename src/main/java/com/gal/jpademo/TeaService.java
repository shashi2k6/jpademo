package com.gal.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaService {

    @Autowired
    private TeaRepository teaRepository;

    public List getTeaList(){
        return teaRepository.findAll();
    }

}
