package com.belajarspring.belajarspring;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringImp implements HelloSpringService {

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
        System.out.println("Halo Kita belajar Spring Boot");
    }

}
