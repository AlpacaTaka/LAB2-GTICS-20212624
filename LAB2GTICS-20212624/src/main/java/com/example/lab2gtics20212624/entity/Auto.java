package com.example.lab2gtics20212624.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private int idauto;

    private String modelo;
    private String color;
    private int kilometraje;

    @ManyToOne
    @JoinColumn(name = "idsede")
    private Sede sede;

    private double costo_por_dia;


}
