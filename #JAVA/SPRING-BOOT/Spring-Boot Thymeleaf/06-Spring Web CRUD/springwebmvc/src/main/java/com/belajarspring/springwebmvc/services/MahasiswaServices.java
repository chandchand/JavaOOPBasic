package com.belajarspring.springwebmvc.services;

import com.belajarspring.springwebmvc.model.Mahasiswa;

import java.util.List;

public interface MahasiswaServices {

    List <Mahasiswa> listMahasiswa();
    Mahasiswa createOrUpdate (Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa (int id);
    void hapus (int id);
}
