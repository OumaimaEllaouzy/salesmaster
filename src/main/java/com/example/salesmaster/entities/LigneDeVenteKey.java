package com.example.salesmaster.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class LigneDeVenteKey implements Serializable
{
    @Column(name = "vente_id")
    Long venteId;

    @Column(name = "produit_id")
    Long produitId;

    
}
