package com.basic_oop;

import com.terminal.Console;

// visibiltas default
class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void show() {
        Console.log("Menggunakan Console");
        System.out.println("Player Name : " + this.name);
    }
}
