package com.basic_oop;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t:" + this.judul);
        System.out.println("\nPenulis\t:" + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Detective Conan", "Aoyama Ghoso");
        buku1.display();

        // menampilkan address
        String addresBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addresBuku1);

        // assigment object
        Buku buku2 = buku1;
        buku2.display();
        String addresBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addresBuku2);

        // karena buku 1 dan 2 berada di address atau referensi yg sama
        buku2.judul = "Detektif Conan";
        buku1.display();
        buku2.display();

        // kita aka memasukan object ke dalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addresDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi : " + addresDataBuku);
        dataBuku.penulis = "Aoyama Gosong";

    }
}
