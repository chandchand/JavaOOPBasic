package com.basic_oop;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ichigo", 20); // ini memakai constructor superclass

        HeroSTR hero2 = new HeroSTR("Rukia", 10);

        HeroSTR hero3 = new HeroSTR("Orihime");

        hero1.display();
        hero2.display();
        hero3.display();
    }
}
