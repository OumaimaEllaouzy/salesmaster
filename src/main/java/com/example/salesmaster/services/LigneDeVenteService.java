package com.example.salesmaster.services;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LigneDeVenteService {

    LigneDeVente createLignedeVente(LigneDeVente lignedeVente);

    List<LigneDeVente> getAllLignedeVente();

    LigneDeVente getLignedeVenteById(LigneDeVenteKey lignedeVenteId);

    LigneDeVente updateLignedeVente(LigneDeVenteKey lignedeVenteId, LigneDeVente lignedeVente);

    void deleteLigneDeVente(LigneDeVenteKey lignedeVenteId);
}
