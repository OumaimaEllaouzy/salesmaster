package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.services.VenteServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/vente")
@RestController
public class VenteController {
    @Autowired
    private VenteServiceimpl venteService;


    @GetMapping
    public ResponseEntity<List<Vente>> getVentes()
    {
        return ResponseEntity.ok(venteService.getAllVente());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vente> getVente(@PathVariable("id") Long venteId)
    {
        return ResponseEntity.ok(venteService.getVenteById(venteId));
    }

    @PostMapping
    public ResponseEntity<Vente> createVente(@RequestBody Vente vente)
    {
        Vente vente1 = venteService.saveVente(vente);
        return new ResponseEntity<>(vente1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vente> updateVente(@PathVariable("id") Long venteId , @RequestBody Vente vente)
    {
        Vente vente1 = venteService.updateVente(venteId,vente);
        return new ResponseEntity<>(vente1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVente(@PathVariable("id") Long venteId)
    {
        venteService.deleteVenteById(venteId);
        return ResponseEntity.ok("Vente deleted successfully !");
    }

}