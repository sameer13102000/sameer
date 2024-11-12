package com.sameer.SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sameer.SpringBootDemo.model.Laptop;
import com.sameer.SpringBootDemo.repo.LaptopRepository;

@Component
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    
    public void addLaptop(Laptop lap) {
        repo.addLaptop(lap);
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }

}
