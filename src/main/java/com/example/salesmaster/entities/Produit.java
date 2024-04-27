package com.example.salesmaster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.HashSet;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class  Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private Long id;
    private String Nom;
    private String Email;
    private Float Prix;
    private int QuantiteEnStock;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL , orphanRemoval = true)
    private Set<LigneDeVente> ligneDeVente = new HashSet<>();

}
