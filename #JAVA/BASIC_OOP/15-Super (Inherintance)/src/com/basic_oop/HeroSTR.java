package com.basic_oop;

// this.name akan mengakses atribut name jika ada di kelas ini.
// jika tidak maka akan mengakses atribut name di superclass.

//super.name akan selalu mengakses atribut name yg ada di superclass.
public class HeroSTR extends Hero {
    String name = "Class Strength";

    void display() {
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper() {
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("method ini ada di subclass");
    }
}
