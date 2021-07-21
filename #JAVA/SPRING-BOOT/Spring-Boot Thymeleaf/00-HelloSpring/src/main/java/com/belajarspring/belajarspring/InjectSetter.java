package com.belajarspring.belajarspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectSetter {

    private HelloSpringService helloSpringService;

    // setter
    @Autowired
    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }

    public void getMessage() {
        helloSpringService.sayHello();
    }

}
