package com.basic_oop;

// inheritance adalah hubungan is-a
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Meliodas";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Ban";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Elizabeth";
        hero3.display();
    }
}
