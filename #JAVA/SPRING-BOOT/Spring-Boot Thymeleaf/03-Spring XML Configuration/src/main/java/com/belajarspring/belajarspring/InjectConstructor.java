package com.belajarspring.belajarspring;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
public class InjectConstructor {

    // menggunakan method constructor
    private HelloSpringService helloSpringService;

    @Autowired
    public InjectConstructor(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }

    public void getMessage() {
        helloSpringService.sayHello();
    }

}
