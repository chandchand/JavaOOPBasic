package com.basic_oop;

class Player {
    String name; // , default dia akan bisa di baca dan di tulis dari luar class
    public int exp; // , public dia akan bisa di baca dan di tulis dari luar class
    private int health; // private, hanya akan bisa di baca dan ditulis di dalam class

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display() {
        nambahExp(); // contoh mengakses private methods
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("Health\t: " + this.health); // membaca, tapi dalam class
    }

    // public
    public void ubahName(String nameBaru) {
        this.name = nameBaru;
    }

    // private
    private void nambahExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Chandra", 0, 100);

        // default
        System.out.println(player1.name); // membaca data
        player1.name = "ChandChand"; // menulis data
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp); // membaca data

        // private (tidak bisa di akses)
        // System.out.println(player1.health); // membaca data
        // player1.health = 200; // menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // Default
        player1.display();

        // public
        player1.ubahName("Shinichi"); // ubah nama bisa di akses
        player1.display();

        // private (tidak bisa di akses)
        // player1.nambahExp();

    }
}
