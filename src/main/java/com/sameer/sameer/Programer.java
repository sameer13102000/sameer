package com.sameer.sameer;

public class Programer {
    
    private int age;
    private Computer com;


    public Computer getLap() {
        return com;
    }
    public void setLap(Computer lap) {
        this.com = lap;
    }
    
    // Contructor Injection
    public Programer(int age, Computer lap){
        this.age = age;
        this.com = lap;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called"); // This is to prove the age has been injected via the setters 
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
