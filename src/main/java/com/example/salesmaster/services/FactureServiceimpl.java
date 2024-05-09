package com.example.salesmaster.services;

import com.example.salesmaster.entities.Facture;
import com.example.salesmaster.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FactureServiceimpl implements FactureService {
    @Autowired
    private FactureRepository factureRepository;

    @Override
    public Facture saveFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Long id,Facture facture) {
        Facture factureFound = getFactureById(id);
        return factureRepository.save(factureFound);
    }

    @Override
    public void deleteFactureById(Long id) {
        Facture facture=getFactureById(id);
        factureRepository.delete(facture);
    }

    @Override
    public void deleteAllFactures() {
        factureRepository.deleteAll();
    }

    @Override
    public Facture getFactureById(Long id) {
       return factureRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("facture Does not exist !"));

    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public List<Facture> getAllFacture() {
        return null;
    }

}