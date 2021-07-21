package com.belajarspring.springwebmvc.controller;

import com.belajarspring.springwebmvc.model.Mahasiswa;
import com.belajarspring.springwebmvc.services.MahasiswaServices;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MahasiswaController {

    //injek mahasiswa service
    private MahasiswaServices mahasiswaServices;
    @Autowired
    public void setMahasiswaServices(MahasiswaServices mahasiswaServices) {
        this.mahasiswaServices = mahasiswaServices;
    }

    @RequestMapping("/mahasiswa")
    public String listMahasiswa(Model model){
        model.addAttribute("mahasiswa",mahasiswaServices.listMahasiswa());
        return "mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/create", method = RequestMethod.GET)
    public String tampilForm(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "form";
    }

    @RequestMapping(value = "/mahasiswa/create", method = RequestMethod.POST)
    public String simpanData(Model model, Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa", mahasiswaServices.createOrUpdate(mahasiswa));
        return "redirect:/mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/edit/{id}", method = RequestMethod.GET)
    public String editData (@PathVariable int id, Model model){
        model.addAttribute("mahasiswa", mahasiswaServices.getIdMahasiswa(id));
        return "form";
    }

    @RequestMapping(value = "/mahasiswa/hapus/{id}")
    public String hapus (@PathVariable int id){
        mahasiswaServices.hapus(id);
        return "redirect:/mahasiswa";
    }
}
