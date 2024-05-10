package com.example.salesmaster.services;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Long id,Utilisateur utilisateur);
    void deleteUtilisateurById(Long id);

    void deleteAllUtilisateurs();

    Utilisateur getUtilisateurById(Long id);
    List<Utilisateur> getAllUtilisateur();
}
