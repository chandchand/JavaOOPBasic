package com.basic_oop;

class Display {
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void setType(String inputType) {
        // type = inputType; // alternatif 1
        // this.type = inputType; alternatif 2
        Display.type = inputType; // alternatif 3 rekomendded
    }

    void show() {
        System.out.println("Display name : " + this.name);
    }

}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        Display display2 = new Display("Smartphone");
        display1.show();
        display2.show();

        // tampilkan static variable atau class variable
        // coba rubah
        display1.setType("Koruptor");

        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    }
}
