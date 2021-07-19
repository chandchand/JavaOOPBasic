package com.basic_oop;

public class HeroSTR extends Hero {
    double defencePower = 100;

    // overriding methods
    void display() {
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
