package com.example.salesmaster.services;

import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.Produit;
import org.springframework.stereotype.Service;


import java.util.List;

public interface ProduitService {


    Produit saveProduit(Produit produit);
    Produit updateProduit(Produit produit);
    void deleteProduitById(Long id);
    void deleteAllProduits();
    Produit getProduitById(Long id);
    List<Produit> getAllProduits();
}
