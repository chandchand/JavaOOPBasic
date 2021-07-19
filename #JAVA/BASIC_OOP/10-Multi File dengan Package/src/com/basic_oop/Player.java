package com.basic_oop;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    void setName() {
        this.name = name;
    }

    void show() {
        System.out.println("Player Name : " + this.name);
    }
}