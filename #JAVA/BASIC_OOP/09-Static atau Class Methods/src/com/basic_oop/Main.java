package com.basic_oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Player {
    private static int numberPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name) {
        this.name = name;
        Player.numberPlayer++;
        Player.nameList.add(this.name);
    }

    void show() {
        System.out.println("Player Name : " + this.name);
    }

    static void showNumberPlayer() {
        System.out.println("Number Of Player is : " + Player.numberPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Hachiken");
        Player player2 = new Player("Mikage");
        Player player3 = new Player("Komaba");
        Player player4 = new Player("Aikawa");

        Player.showNumberPlayer();

        System.out.println("Names = " + Player.getNames());
        // System.out.println("Names = " + player1.getNames()); // ini bisa digunakan
    }
}
