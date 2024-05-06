package com.example.salesmaster.services;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Produit saveUtilisateur(Utilisateur utilisateur);
    Produit updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateurById(Long id);
    void deleteAllUtilisateur();

    void deleteAllUtilisateurs();

    Produit getUtilisateurById(Long id);

    Utilisateur getUtilisateurtById(Long id);

    List<Produit> getAllUtilisateurs();
}
