package com.sameer.sameer.springJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.sameer.sameer.Computer;
import com.sameer.sameer.Laptop;
import com.sameer.sameer.Programer;

@Configurable
public class AppConfig {

    // Below bean is of Programer Class. As the Programer class is dependent on Computer interface so we autowired Computer interface. 
    @Bean
    public Programer getProgramerBean(@Autowired Computer com){
        Programer pgm = new Programer();
        pgm.setAge(25); //-> setting the age and then returing the pgm obj
        pgm.setCom(com); //-> This sets the Computer Bean to Laptop Class as we have already defined it below.
        return pgm;
    }



    // @Bean(name = {"sameer", "com1", "Rocky"}) -> This can be used if you want to anme your bean using name parameter and with n number of names.
    
    @Bean
    @Scope("prototype") // ->  This line makes the Laptop Bean prototype bean which means multiple beans can be created. By default it is singleton
    public Laptop getLaptopBean(){
        return new Laptop();
    }

}
