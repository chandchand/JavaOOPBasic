package com.basic_oop;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean liveStat;

    // ini adalah object member
    private Weapon weapon;
    private Armor armor;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 70;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.liveStat = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void Attack(Player opponent) {
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(
                "\nPlayer\t : " + this.name + " is attacking " + opponent.getName() + " with " + damage + " damages");
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage) {
        // recieve damage
        int defencePower = this.armor.getDP();
        int deltaDamage;

        System.out.println(this.name + " defence power = " + defencePower);
        if (damage > defencePower) {
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        System.out.println("damage earned = " + deltaDamage);

        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0) {
            this.liveStat = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();

    }

    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    // private int getDefencePower(){
    // return this.baseHealth + this.level * this.incrementHealth +
    // this.armor.getAddHealt();
    // }

    private void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void display() {
        System.out.println("\nPlayer\t : " + this.name);
        System.out.println("Level\t : " + this.level);
        System.out.println("Health\t : " + this.getHealth() + "/" + this.maxHealth() + " + Armor STR");
        System.out.println("Attack\t : " + this.getAttackPower());
        System.out.println("Alive\t : " + this.liveStat);
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealt();
    }

}

class Armor {
    private String name;
    private int str;
    private int health;

    public Armor(String name, int str, int health) {
        this.name = name;
        this.str = str;
        this.health = health;
    }

    public int getAddHealt() {
        return this.str * 10 + this.health;
    }

    public int getDP() {
        return this.str * 2;
    }
}

class Weapon {
    private String name;
    private int AP;

    public Weapon(String name, int AP) {
        this.name = name;
        this.AP = AP;
    }

    public int getAttack() {
        return this.AP;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Kirito");
        Armor armor1 = new Armor("Jubah Hitam", 10, 200);
        Weapon weapon1 = new Weapon("Dual Sword", 35);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Heathcliff");
        Armor armor2 = new Armor("Templar Armor", 15, 230);
        Weapon weapon2 = new Weapon("Sword & Shield", 20);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.Attack(player2);
        player2.Attack(player1);
        player1.Attack(player2);
        player2.Attack(player1);
        player1.Attack(player2);
        player2.Attack(player1);
        player1.Attack(player2);
        player1.Attack(player2);

    }
}
