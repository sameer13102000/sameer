package com.sameer.sameer.springJava;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.sameer.sameer.Laptop;

@Configurable
public class AppConfig {

    // @Bean(name = {"sameer", "com1", "Rocky"}) -> This can be used if you want to anme your bean using name parameter and with n number of names.
    
    @Bean
    @Scope("prototype") // ->  This line makes the Laptop Bean prototype bean which means multiple beans can be created. By default it is singleton
    public Laptop getLaptopBean(){
        return new Laptop();
    }

}
