package com.example.laptop.controllers;

import com.example.laptop.entities.Laptop;
import com.example.laptop.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopRepository laptopRepository;

    @GetMapping("/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/laptops")
    public Laptop save(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }



}
