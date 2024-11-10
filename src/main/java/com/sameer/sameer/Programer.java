package com.sameer.sameer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programer {
    
    @Value("21")
    private int age;
    private Computer com;

    public Programer(){
        System.out.println("Programer Object created");
    }


    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter called"); // This is to prove the age has been injected via the setters 
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
