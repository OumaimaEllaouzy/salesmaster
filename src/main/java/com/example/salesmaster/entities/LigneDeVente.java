package com.example.salesmaster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LigneDeVente {
    @EmbeddedId
    LigneDeVenteKey id;

    @ManyToOne
    @MapsId("produitId")
    @JoinColumn(name = "produit_id")
    Produit produit;

    @ManyToOne
    @MapsId("venteId")
    @JoinColumn(name = "vente_id")
    Vente vente;

    private int quantity;
    private double prixUnitaire;

    public LigneDeVente(LigneDeVenteKey id, int quantite, Double prixUnitaire) {
        this.id = id;
        this.quantity = quantite;
        this.prixUnitaire = prixUnitaire;
    }
}

