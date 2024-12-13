package com.jeeproject.residenceetudiantes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Statistiques {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float tauxOccupation;
    private int paiementsEnRetard;
    private int incidentsEnCours;
    private int chambresDisponibles;
}
