package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.services.ProduitServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/produit")
@RestController
public class ProduitController {
    @Autowired
    private ProduitServiceimpl produitService;


    @GetMapping
    public ResponseEntity<List<Produit>> getProduits()
    {
        return ResponseEntity.ok(produitService.getAllProduit());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduit(@PathVariable("id") Long produitId)
    {
        return ResponseEntity.ok(produitService.getProduitById(produitId));
    }

    @PostMapping
    public ResponseEntity<Produit> createProduit(@RequestBody Produit produit)
    {
        Produit produit1 = produitService.saveProduit(produit);
        return new ResponseEntity<>(produit1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> updateProduit(@PathVariable("id") Long produitId , @RequestBody Produit produit)
    {
        Produit produit1 = produitService.updateProduit(produitId,produit);
        return new ResponseEntity<>(produit1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduit(@PathVariable("id") Long produitId)
    {
        produitService.deleteProduitById(produitId);
        return ResponseEntity.ok("Produit deleted successfully !");
    }

}