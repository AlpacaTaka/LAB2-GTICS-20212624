package com.example.lab2gtics20212624.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private int idseguro;

    private String empresa_aseguradora;
    private double cobertura_maxima;
    private double tarifa;
}
