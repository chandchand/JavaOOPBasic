package com.basic_oop;

public class HeroSTR extends Hero {
    String type = "Strength";

    // subclass constructor
    HeroSTR(String nameInput, double APInput, double healthInput) {
        super(nameInput, APInput, healthInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " recieve half damage " + damage + " -> " + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }
}
