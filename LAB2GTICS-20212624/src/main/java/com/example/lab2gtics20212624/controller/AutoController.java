package com.example.lab2gtics20212624.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutoController {


    @GetMapping("/test")
        public String listaAutos(){
            return "test";
        }
    }
