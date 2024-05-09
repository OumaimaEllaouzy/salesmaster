package com.example.salesmaster.services;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
import org.springframework.stereotype.Service;

import java.util.List;

    public interface LigneDeVenteService {

        LigneDeVente saveLigneDeVente(LigneDeVente ligneDeVente);
        LigneDeVente updateLigneDeVente(Long id,LigneDeVente ligneDeVente);
        void deleteLigneDeVenteById(Long id);
        void deleteAllLigneDeVentes();

        LigneDeVente getLigneDeVenteById(Long id);
        List<LigneDeVente> getAllLigneDeVente();
    }
