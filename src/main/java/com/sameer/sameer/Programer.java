package com.sameer.sameer;

public class Programer {
    private int age;

    public Programer(){

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
    }

}
