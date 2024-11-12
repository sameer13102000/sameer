package com.sameer.SpringBootDemo.repo;

import org.springframework.stereotype.Repository;

import com.sameer.SpringBootDemo.model.Laptop;

@Repository
public class LaptopRepository {

    public void addLaptop(Laptop lap){
        System.out.println("Laptop added to Database");
    }

}
