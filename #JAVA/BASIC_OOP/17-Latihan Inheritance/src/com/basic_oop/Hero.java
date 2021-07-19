package com.basic_oop;

public class Hero {
    // attribut
    String name;
    double AP, health;

    // constructor
    Hero(String nameInput, double APInput, double healthInput) {
        this.name = nameInput;
        this.AP = APInput;
        this.health = healthInput;
    }

    void attack(Hero enemy) {
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.AP);
    }

    void takeDamage(double damage) {
        System.out.println(this.name + " recieve damage " + damage);
        this.health = this.health - damage;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Power : " + this.AP);
    }
}