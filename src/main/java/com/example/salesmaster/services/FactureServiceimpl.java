package com.example.salesmaster.services;

import com.example.salesmaster.entities.Facture;
import com.example.salesmaster.repositories.FactureRepository;
import com.example.salesmaster.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FactureServiceimpl implements FactureService {

    private FactureRepository factureRepository;

    @Autowired
    public FactureServiceimpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @Override
    public Facture saveFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public void deleteFactureById(Long id) {
        factureRepository.deleteById(id);   }

    @Override
    public void deleteAllFactures() {
        factureRepository.deleteAll();
    }

    @Override
    public Facture getFactureById(Long id) {
        return factureRepository.findById(id).get();
    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }
}