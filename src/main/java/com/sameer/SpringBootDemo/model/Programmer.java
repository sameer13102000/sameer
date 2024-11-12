package com.sameer.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Value("21")
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

    public Computer getCom() {
        return com;
    }
    
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }
    
    public void run(){
        com.compile();
    }
}
