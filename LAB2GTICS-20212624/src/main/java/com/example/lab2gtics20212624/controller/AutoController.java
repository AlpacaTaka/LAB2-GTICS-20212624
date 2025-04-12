package com.example.lab2gtics20212624.controller;

import com.example.lab2gtics20212624.entity.Auto;
import com.example.lab2gtics20212624.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @GetMapping("/Auto/lista")
        public String listaAutos(Model model){
        List<Auto> autos = autoRepository.findAll();
        model.addAttribute("autoList", autos);
            return "Auto/listarAuto";
        }
    }
