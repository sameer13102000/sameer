package com.sameer.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }


}
