package com.example.lab2gtics20212624.controller;



import com.example.lab2gtics20212624.entity.Sede;
import com.example.lab2gtics20212624.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SedeController {

    @Autowired
    private SedeRepository sedeRepository;

    @GetMapping("/Sede/lista")
    public String listaSedes(Model model){
        List<Sede> sedes = sedeRepository.findAll();
        model.addAttribute("sedeList", sedes);

        return "Sede/listarSedes";
    }
}

