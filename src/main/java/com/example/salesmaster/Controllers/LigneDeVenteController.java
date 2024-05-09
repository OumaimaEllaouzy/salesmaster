package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.LigneDeVente;
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


    @GetMapping
    public ResponseEntity<List<LigneDeVente>> getLigneDeVentes()
    {
        return ResponseEntity.ok(ligneDeVenteService.getAllLigneDeVente());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LigneDeVente> getLigneDeVente(@PathVariable("id") Long ligneDeVenteId)
    {
        return ResponseEntity.ok(ligneDeVenteService.getLigneDeVenteById(ligneDeVenteId));
    }

    @PostMapping
    public ResponseEntity<LigneDeVente> createLigneDeVente(@RequestBody LigneDeVente ligneDeVente)
    {
        LigneDeVente ligneDeVente1 = ligneDeVenteService.saveLigneDeVente(ligneDeVente);
        return new ResponseEntity<>(ligneDeVente1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LigneDeVente> updateLigneDeVente(@PathVariable("id") Long ligneDeVenteId , @RequestBody LigneDeVente ligneDeVente)
    {
        LigneDeVente lignedeVente1 = ligneDeVenteService.updateLigneDeVente(ligneDeVenteId,ligneDeVente);
        return new ResponseEntity<>(lignedeVente1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLigneDeVente(@PathVariable("id") Long ligneDeVenteId)
    {
        ligneDeVenteService.deleteLigneDeVenteById(ligneDeVenteId);
        return ResponseEntity.ok("LigneDeVente deleted successfully !");
    }

}