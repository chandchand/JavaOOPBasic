package com.basic_oop;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Kirito";
        hero1.display();

        HeroSTR hero2 = new HeroSTR();
        hero2.name = "Agil";
        hero2.display();

        HeroINT hero3 = new HeroINT();
        hero3.name = "Asuna";
        hero3.display();
    }
}
