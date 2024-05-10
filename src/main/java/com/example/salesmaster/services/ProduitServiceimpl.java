package com.example.salesmaster.services;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceimpl implements ProduitService{

    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Long id,Produit produit) {
        Produit produitFound = getProduitById(id);
        return produitRepository.save(produitFound);
    }

    @Override
    public void deleteProduitById(Long id) {
        Produit produit=getProduitById(id);
        produitRepository.delete(produit);
    }

    @Override
    public void deleteAllProduits() {
        produitRepository.deleteAll();
    }

    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("produit Does not exist !"));

    }
    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

}