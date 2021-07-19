package com.basic_oop;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Candra");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Kirito");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading pada methods

        int a = Matematika.tambah(5, 10);
        System.out.println(a);
        double b = Matematika.tambah(3, 10);
        System.out.println(b);
    }
}
