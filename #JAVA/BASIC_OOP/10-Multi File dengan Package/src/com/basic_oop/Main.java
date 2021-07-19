package com.basic_oop;

//keyword import package terminal
import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Itami");
        Player player2 = new Player("Pinya");
        Player player3 = new Player("Kuribayashi");
        player1.show();
        player2.show();
        player3.show();

        Console.log("Hello World");
    }
}
