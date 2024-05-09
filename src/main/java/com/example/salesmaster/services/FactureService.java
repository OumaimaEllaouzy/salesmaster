package com.example.salesmaster.services;

import com.example.salesmaster.entities.Facture;
import org.springframework.stereotype.Service;


import java.util.List;

public interface FactureService{

    Facture saveFacture(Facture facture);
    Facture updateFacture(Long id,Facture facture);
    void deleteFactureById(Long id);
    void deleteAllFactures();
    Facture getFactureById(Long id);

    List<Facture> getAllFactures();

    List<Facture> getAllFacture();
}