package com.sameer.sameer;

public class Programer {
    
    private int age;
    private Computer com;


    // public Computer getLap() {
    //     return com;
    // }
    // public void setLap(Computer lap) {
    //     this.com = lap;
    // }
    
    // Contructor Injection
    // public Programer(int age, Computer com){
    //     this.age = age;
    //     this.com = com;
    // }


    public Computer getCom() {
        return com;
    }

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
