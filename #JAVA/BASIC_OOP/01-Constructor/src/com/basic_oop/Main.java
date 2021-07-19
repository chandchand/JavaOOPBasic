package com.basic_oop;

// class dengan constructor
class Siswa {
    String nama;
    String NIS;
    String jurusan;

    // constructor dipanggi saat object pertam kali dibuat
    // Siswa() {
    // System.out.println("ini adalah contructor");
    // }

    // constructor dengan parameter
    Siswa(String inputNama, String inputNIS, String inputJurusan) {
        nama = inputNama;
        NIS = inputNIS;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIS);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {

        // instansiasi/membuat object
        Siswa siswa1 = new Siswa("Chandra", "4869666", "Rekayasa Perangkat Lunak");
        Siswa siswa2 = new Siswa("Kudo", "4869555", "Detective");
    }
}
