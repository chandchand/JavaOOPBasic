package com.basic_oop;

//membuat class sebagai template
//class tanpa contructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {

    public static void main(String[] args) {

        // instansiasi/membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Candra";
        mahasiswa1.NIM = "4869666";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;

        System.out.println("Nama: " + mahasiswa1.nama);
        System.out.println("NIM: " + mahasiswa1.NIM);
        System.out.println("Jurusan: " + mahasiswa1.jurusan);
        System.out.println("IPK: " + mahasiswa1.IPK);
        System.out.println("Umur: " + mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Kudo";
        mahasiswa2.NIM = "4869666";
        mahasiswa2.jurusan = "Detective";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.umur = 20;

        System.out.println("Nama: " + mahasiswa2.nama);
        System.out.println("NIM: " + mahasiswa2.NIM);
        System.out.println("Jurusan: " + mahasiswa2.jurusan);
        System.out.println("IPK: " + mahasiswa2.IPK);
        System.out.println("Umur: " + mahasiswa2.umur);

    }

}
