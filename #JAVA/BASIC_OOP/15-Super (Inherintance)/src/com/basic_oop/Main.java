package com.basic_oop;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        HeroSTR hero2 = new HeroSTR();

        hero1.display();
        hero2.display();
        hero2.displaySuper();
    }
}
