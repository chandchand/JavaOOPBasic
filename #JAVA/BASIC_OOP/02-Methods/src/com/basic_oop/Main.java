package com.basic_oop;

class Mahasiswa {
    // data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method dengan parameter tanpa return
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan parameter
    String sayHi(String message) {
        return message + ", nama saya " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Chandra", "4869666");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("ChandChand");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        mahasiswa1.setNama("Chandra");
        String data = mahasiswa1.sayHi("Hai");
        System.out.println(data);
    }
}
