package com.basic_oop;

public class Hero {
    // atrribut
    String name;
    double defencePower;

    // constructor
    Hero(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    // overloading
    Hero(String name) {
        this.name = name;
    }

    // methods
    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
