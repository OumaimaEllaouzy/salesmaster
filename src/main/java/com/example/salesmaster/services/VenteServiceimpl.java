package com.example.salesmaster.services;

import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenteServiceimpl implements VenteService{

    @Autowired
    private VenteRepository venteRepository;
    @Override
    public Vente saveVente(Vente vente) {
        return venteRepository.save(vente);
    }

    @Override
    public Vente updateVente(Long id,Vente vente) {
        Vente venteFound = getVenteById(id);
        return venteRepository.save(venteFound);
    }

    @Override
    public void deleteVenteById(Long id) {
        Vente vente=getVenteById(id);
        venteRepository.delete(vente);
    }

    @Override
    public void deleteAllVentes() {
        venteRepository.deleteAll();
    }

    @Override
    public Vente getVenteById(Long id) {
        return venteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("vente Does not exist !"));

    }
    @Override
    public List<Vente> getAllVente() {
        return venteRepository.findAll();
    }

}