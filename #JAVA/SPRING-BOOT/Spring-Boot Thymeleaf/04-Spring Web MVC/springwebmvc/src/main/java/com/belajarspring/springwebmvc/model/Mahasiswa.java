package com.belajarspring.springwebmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_mahasiswa")
public class Mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @Column(name = "nama_mahasiswa")
    private String nama;
    private String jurusan;
    private String nim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
