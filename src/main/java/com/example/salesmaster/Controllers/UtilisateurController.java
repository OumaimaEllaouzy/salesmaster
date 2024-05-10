package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.Utilisateur;
import com.example.salesmaster.services.UtilisateurServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/utilisateur")
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurServiceimpl utilisateurService;


    @GetMapping
    public ResponseEntity<List<Utilisateur>> getUtilisateurs()
    {
        return ResponseEntity.ok(utilisateurService.getAllUtilisateur());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable("id") Long utilisateurId)
    {
        return ResponseEntity.ok(utilisateurService.getUtilisateurById(utilisateurId));
    }

    @PostMapping
    public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur)
    {
        Utilisateur utilisateur1 = utilisateurService.saveUtilisateur(utilisateur);
        return new ResponseEntity<>(utilisateur1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable("id") Long utilisateurId , @RequestBody Utilisateur utilisateur)
    {
        Utilisateur utilisateur1 = utilisateurService.updateUtilisateur(utilisateurId,utilisateur);
        return new ResponseEntity<>(utilisateur1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUtilisateur(@PathVariable("id") Long utilisateurId)
    {
        utilisateurService.deleteUtilisateurById(utilisateurId);
        return ResponseEntity.ok("Utilisateur deleted successfully !");
    }

}