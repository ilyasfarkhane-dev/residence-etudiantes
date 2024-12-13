package com.jeeproject.residenceetudiantes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String telephone;
    private String statutPaiement;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    @OneToMany(mappedBy = "resident", cascade = CascadeType.ALL)
    private List<Paiement> paiements;

    @OneToMany(mappedBy = "resident", cascade = CascadeType.ALL)
    private List<Incident> incidents;


}
