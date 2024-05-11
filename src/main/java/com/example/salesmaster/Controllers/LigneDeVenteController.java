package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
import com.example.salesmaster.services.LigneDeVenteService;
import com.example.salesmaster.services.LigneDeVenteServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/ligneDeVente")
@RestController
public class LigneDeVenteController {
    @Autowired
    private LigneDeVenteService ligneDeVenteService;

    @GetMapping
    public ResponseEntity<List<LigneDeVente>> getLigneDeVentes()
    {
        List<LigneDeVente> allLignedeVente = ligneDeVenteService.getAllLigneDeVente();
        return new ResponseEntity<>(allLignedeVente, HttpStatus.OK);
    }


    @GetMapping("/{venteId}/{produitId}")

    public ResponseEntity<LigneDeVente> getLigneDeVenteById(@PathVariable Long venteId, @PathVariable Long produitId) {
        LigneDeVenteKey ligneDeVenteId = new LigneDeVenteKey(venteId, produitId);
        LigneDeVente ligneDeVente = ligneDeVenteService.getLigneDeVenteById(ligneDeVenteId);
        return new ResponseEntity<>(ligneDeVente, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<LigneDeVente> saveLigneDeVente(@RequestBody LigneDeVente ligneDeVente) {
        System.out.println("Id of vente&produit : " + ligneDeVente.getId().getVenteId()+" "+ligneDeVente.getId().getProduitId() + "quantity : " + ligneDeVente.getQuantity() + "Prix Unitaire : " + ligneDeVente.getPrixUnitaire());
        LigneDeVente createdLignedeVente = ligneDeVenteService.saveLigneDeVente(ligneDeVente);
        return new ResponseEntity<>(createdLignedeVente, HttpStatus.CREATED);
    }


    @PutMapping("/{venteId}/{produitId}")
    public ResponseEntity<LigneDeVente> updateLigneDeVente(@PathVariable Long venteId, @PathVariable Long produitId, @RequestBody LigneDeVente ligneDeVenteDto) {
        LigneDeVenteKey ligneDeVenteId = new LigneDeVenteKey(venteId, produitId);
        LigneDeVente updatedLignedeVente = ligneDeVenteService.updateLigneDeVente(ligneDeVenteId, ligneDeVente);
        return new ResponseEntity<>(updatedLignedeVente, HttpStatus.OK);

    @DeleteMapping("/{venteId}/{produitId}")
    public ResponseEntity<Void> deleteLigneDeVente(@PathVariable Long venteId, @PathVariable Long produitId) {
        LigneDeVenteKey lignedeVenteId = new LigneDeVenteKey(venteId, produitId);
        ligneDeVenteService.deleteLigneDeVente(lignedeVenteId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}