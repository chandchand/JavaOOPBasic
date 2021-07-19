package com.terminal;

// visibilitas semuanya
public class Console {
    public static void log(String message) {
        System.out.println(message);
    }
}

// ini hanya bisa di akses dari package com.terminal
class Terminal {
    public static void log(String message) {
        System.out.println(message);
    }
}
