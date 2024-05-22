package com.example.salesmaster.services;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
import com.example.salesmaster.repositories.LigneDeVenteRepository;
import com.example.salesmaster.repositories.ProduitRepository;
import com.example.salesmaster.repositories.VenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LigneDeVenteServiceimpl implements LigneDeVenteService{
    @Autowired
    private LigneDeVenteRepository ligneDeVenteRepository;
    @Autowired
    private VenteRepository ventreRepository;
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public LigneDeVente createLignedeVente(LigneDeVente lignedeVente) {
        LigneDeVente ligneDeVente2 = new LigneDeVente(
                new LigneDeVenteKey(lignedeVente.getId().getVenteId(),
                        lignedeVente.getId().getProduitId()
                ),
                lignedeVente.getQuantity(),
                lignedeVente.getPrixUnitaire()
        );
        ligneDeVente2.setVente(ventreRepository.findById(lignedeVente.getId().getVenteId()).orElseThrow(() -> new RuntimeException("Vente does not exist !")));
        ligneDeVente2.setProduit(produitRepository.findById(lignedeVente.getId().getProduitId())
                .orElseThrow(() -> new RuntimeException("Produit does not exist !")));
        return ligneDeVenteRepository.save(ligneDeVente2);
    }

    @Override
    public void deleteLigneDeVente(LigneDeVenteKey lignedeVenteId) {
        LigneDeVente ligneDeVente = getLignedeVenteById(lignedeVenteId);
        ligneDeVenteRepository.delete(ligneDeVente);
    }

    @Override
    public List<LigneDeVente> getAllLignedeVente() {
        return ligneDeVenteRepository.findAll();
    }

    @Override
    public LigneDeVente getLignedeVenteById(LigneDeVenteKey lignedeVenteId) {
        LigneDeVente ligneDeVente = ligneDeVenteRepository.findById(lignedeVenteId)
                .orElseThrow(() -> new RuntimeException("ligne de vente id not exist"));
        return ligneDeVente;
    }

    @Override
    public LigneDeVente updateLignedeVente(LigneDeVenteKey lignedeVenteId, LigneDeVente lignedeVente) {
        LigneDeVente ligneDeVente2 = getLignedeVenteById(lignedeVenteId);
        ligneDeVente2.setQuantity(lignedeVente.getQuantity());
        ligneDeVente2.setPrixUnitaire(lignedeVente.getPrixUnitaire());
        return null;
    }




}