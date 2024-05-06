package com.example.salesmaster.Controllers;


import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.services.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
package com.example.salesmaster.controllers;

import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.services.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventes")
public class VenteController {
    @Autowired
    private VenteService venteService;

    @GetMapping("/")
    public List<Vente> getAllVentes() {
        return venteService.getAllVentes();
    }

    @PostMapping("/")
    public Vente createVente(@RequestBody Vente vente) {
        return venteService.createVente(vente);
    }

}