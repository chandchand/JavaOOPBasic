package com.basic_oop;

// ini akan mengimport class console
import com.terminal.Console;
//menimport static methods dari console
import static com.terminal.Console.log;

//ini tidak boleh digunakan
// class Test{

// }

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Conan");

        Console.log("Menampilkan data dengan class Console();");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja dari methods Console(); ");
        log(player1.getName());
    }
}
