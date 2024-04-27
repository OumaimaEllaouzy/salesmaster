package com.example.salesmaster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vente_id")
    private Long id;
    private Date DateVente;
    private String Status;
    private Float Total;

    @ManyToOne
    private Client client;

    @OneToOne
    private Facture facture;

    @OneToMany(mappedBy = "vente", cascade = CascadeType.ALL , orphanRemoval = true)
    private Set<LigneDeVente> ligneDeVente = new HashSet<>();
}

