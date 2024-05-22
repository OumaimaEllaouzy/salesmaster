package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.entities.LigneDeVenteKey;
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
    private LigneDeVenteServiceimpl ligneDeVenteService;


    @PostMapping
    public ResponseEntity<LigneDeVente> createLignedeVente(@RequestBody LigneDeVente ligneDeVente)
    {
        return new ResponseEntity<>(ligneDeVenteService.createLignedeVente(ligneDeVente), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LigneDeVente>> getAllLignedeVente()
    {
        return new ResponseEntity<>(ligneDeVenteService.getAllLignedeVente(), HttpStatus.OK);
    }

    @GetMapping("/{venteId}/{produitId}")
    public ResponseEntity<LigneDeVente> getLignedeVenteById(@PathVariable Long venteId,
                                                            @PathVariable Long produitId) {
        LigneDeVenteKey lignedeVenteId = new LigneDeVenteKey(venteId, produitId);
        LigneDeVente lignedeVente = ligneDeVenteService.getLignedeVenteById(lignedeVenteId);
        return new ResponseEntity<>(lignedeVente, HttpStatus.OK);
    }

    @PutMapping("/{venteId}/{produitId}")
    public ResponseEntity<LigneDeVente> updateLignedeVente(@PathVariable Long venteId, @PathVariable Long produitId,
                                                           @RequestBody LigneDeVente lignedeVenteDto) {
        LigneDeVenteKey lignedeVenteId = new LigneDeVenteKey(venteId, produitId);
        LigneDeVente updatedLignedeVente = ligneDeVenteService.updateLignedeVente(lignedeVenteId, lignedeVenteDto);
        return new ResponseEntity<>(updatedLignedeVente, HttpStatus.OK);
    }

    @DeleteMapping("/{venteId}/{produitId}")
    public ResponseEntity<Void> deleteLignedeVente(@PathVariable Long venteId, @PathVariable Long produitId) {
        LigneDeVenteKey lignedeVenteId = new LigneDeVenteKey(venteId, produitId);
        ligneDeVenteService.deleteLigneDeVente(lignedeVenteId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}