package com.example.salesmaster.services;

import com.example.salesmaster.entities.Utilisateur;
import com.example.salesmaster.entities.Vente;
import org.springframework.stereotype.Service;
import com.example.salesmaster.entities.LigneDeVente;

import com.example.salesmaster.entities.Produit;
import java.util.List;

public interface VenteService {


    Vente saveVente(Vente vente);

    Vente updateVente(Long id,Vente vente);

    void deleteVenteById(Long id);

    void deleteAllVentes();

    Vente getVenteById(Long id);


    List<Vente> getAllVente();

}