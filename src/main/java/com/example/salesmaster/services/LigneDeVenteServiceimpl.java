package com.example.salesmaster.services;


import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.repositories.LigneDeVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LigneDeVenteServiceimpl implements LigneDeVenteService{



    private LigneDeVenteRepository ligneDeVenteRepository;

    @Autowired
    public LigneDeVenteServiceimpl(LigneDeVenteRepository ligneDeVenteRepository) {
        this.ligneDeVenteRepository = ligneDeVenteRepository;
    }

    @Override
    public LigneDeVente saveLigneDeVente(LigneDeVente ligneDeVente) {
        return ligneDeVenteRepository.save(ligneDeVente);
    }

    @Override
    public LigneDeVente updateLigneDeVente(LigneDeVente ligneDeVente) {
        return ligneDeVenteRepository.save(ligneDeVente);
    }

    @Override
    public void deleteLigneDeVenteById(Long id) {
        ligneDeVenteRepository.deleteById(id);   }

    @Override
    public void deleteAllLignesDeVente() {

    }

    @Override
    public void deleteAlLignesDeVente() {
        ligneDeVenteRepository.deleteAll();
    }

    @Override
    public LigneDeVente getLigneDeVenteById(Long id) {
        return ligneDeVenteRepository.findById(id).get();
    }

    @Override
    public List<LigneDeVente> getAllLignesDeVente() {
        return ligneDeVenteRepository.findAll();
    }
}