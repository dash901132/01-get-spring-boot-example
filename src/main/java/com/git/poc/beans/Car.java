package com.git.poc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
public class Car {
    @Autowired
    Engine engine;
   static{
       System.out.println("this car class");
   }

   public void start(){
       engine.engine();
       System.out.println("get engine for starting car");
   }
}
