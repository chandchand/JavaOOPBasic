package com.basic_oop;

// PLAYER
class Player {
    String name;
    double health;
    int level;
    // object member/data member
    Weapon weapon;
    Armor armor;

    // contructor
    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // method mengequip weapon
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + "HP");
        this.weapon.display();
        this.armor.display();
    }

    void attack(Player opponent) {
        double AP = this.weapon.AP;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + AP);
        opponent.defence(AP);
    }

    void defence(double AP) {
        // akan mengambil damage
        double damage;
        if (this.armor.DP < AP) {
            damage = AP - this.armor.DP;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " get damage " + damage);
    }
}

// SENJATA
class Weapon {
    double AP;
    String name;

    // contructor
    Weapon(String name, double AP) {
        this.name = name;
        this.AP = AP;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", Attack Power :" + this.AP);
    }
}

// ARMOR
class Armor {
    double DP;
    String name;

    Armor(String name, double DP) {
        this.name = name;
        this.DP = DP;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", Defence Power :" + this.DP);
    }
}

public class Main {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("Kirito", 100);
        Player player2 = new Player("Heathcliff", 80);

        // membuat object weapon
        Weapon sword = new Weapon("Dual Sword", 40);
        Weapon swordShield = new Weapon("Sword & Shield", 35);

        // membuat object armor
        Armor jubahHitam = new Armor("Jubah Hitam", 10);
        Armor templaArmor = new Armor("Templar Armor", 15);

        // player 1
        player1.equipWeapon(sword);
        player1.equipArmor(jubahHitam);
        player1.display();

        // player 2
        player2.equipWeapon(swordShield);
        player2.equipArmor(templaArmor);
        player2.display();

        System.out.println("\nBattle");
        System.out.println("\nPlayer 1 Turn");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nPlayer 2 Turn");
        player2.attack(player1);
        player1.display();
        player2.display();

    }
}
