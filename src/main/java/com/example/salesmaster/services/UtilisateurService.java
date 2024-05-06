package com.example.salesmaster.services;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateurById(Long id);
    void deleteAllUtilisateur();

    void deleteAllUtilisateurs();

    Utilisateur getUtilisateurById(Long id);

    Utilisateur getUtilisateurtById(Long id);

    List<Utilisateur> getAllUtilisateurs();
}
