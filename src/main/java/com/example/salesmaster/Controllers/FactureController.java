package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.Facture;
import com.example.salesmaster.services.FactureServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/facture")
@RestController
public class FactureController {
    @Autowired
    private FactureServiceimpl factureService;

    @GetMapping
    public ResponseEntity<List<Facture>> getFactures()
    {
        return ResponseEntity.ok(factureService.getAllFacture());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facture> getFacture(@PathVariable("id") Long factureId)
    {
        return ResponseEntity.ok(factureService.getFactureById(factureId));
    }

    @PostMapping
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture)
    {
        Facture facture1 = factureService.saveFacture (facture);
        return new ResponseEntity<>(facture1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Facture> updateFacture(@PathVariable("id") Long factureId , @RequestBody Facture facture)
    {
        Facture facture1 = factureService.updateFacture(factureId,facture);
        return new ResponseEntity<>(facture1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFacture(@PathVariable("id") Long factureId)
    {
        factureService.deleteFactureById(factureId);
        return ResponseEntity.ok("Facture deleted successfully !");
    }

}
