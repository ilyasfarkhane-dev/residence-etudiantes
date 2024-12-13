package com.jeeproject.residenceetudiantes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chambre {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String numero;
    private String statut;
    private String taille;
    private Boolean equipements;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    private List<Resident> residents;


}