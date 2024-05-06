package com.example.salesmaster.services;

import com.example.salesmaster.entities.Utilisateur;
import com.example.salesmaster.entities.Vente;
import org.springframework.stereotype.Service;
import com.example.salesmaster.entities.LigneDeVente;

import com.example.salesmaster.entities.Produit;
import java.util.List;

public interface VenteService {


    Vente saveVente(Vente vente);

    Vente updateVente(Vente vente);

    void deleteVenteById(Long id);

    void deleteAllVentes();

    Vente getVenteById(Long id);

    Vente getVentetById(Long id);

    List<Vente> getAllVentes();

    VenteService saveVenteService(VenteService venteservice);
    VenteService updateVenteService(VenteService venteservice);
    void deleteVenteServiceById(Long id);
    void deleteAllVentesService();
    VenteService getVenteServiceById(Long id);
    List<VenteService> getAllVentesService();
}