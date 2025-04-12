package com.example.lab2gtics20212624.controller;

import com.example.lab2gtics20212624.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeguroController {
    @Autowired
    private SeguroRepository seguroRepository;

    @GetMapping("/Seguro/lista")
    public String listaSeguros(Model model){
        model.addAttribute("seguroList", seguroRepository.findAll());
        return "Seguro/listarSeguro";
    }
}
