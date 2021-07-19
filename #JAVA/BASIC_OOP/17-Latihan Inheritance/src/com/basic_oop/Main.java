package com.basic_oop;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Kirito", 20, 100);
        HeroSTR hero2 = new HeroSTR("Heatcliff", 15, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.display();

        hero2.attack(hero1);
        hero1.display();

    }
}
