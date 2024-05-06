package com.example.salesmaster.services;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
import org.springframework.stereotype.Service;

import java.util.List;

    public interface LigneDeVenteService {

        LigneDeVente saveLigneDeVente(LigneDeVente ligneDeVente);
        LigneDeVente updateLigneDeVente(LigneDeVente ligneDeVente);
        void deleteLigneDeVenteById(Long id);
        void deleteAllLignesDeVente();

        void deleteAlLignesDeVente();

        LigneDeVente getLigneDeVenteById(Long id);
        List<LigneDeVente> getAllLignesDeVente();
    }
}
