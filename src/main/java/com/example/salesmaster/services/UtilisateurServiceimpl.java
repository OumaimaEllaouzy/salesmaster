package com.example.salesmaster.services;

import com.example.salesmaster.entities.Utilisateur;
import com.example.salesmaster.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilisateurServiceimpl implements UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServiceimpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }


    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }


    @Override
    public void deleteUtilisateurById(Long id) {
        utilisateurRepository.deleteById(id);   }

    @Override
    public void deleteAllUtilisateur() {

    }


    @Override
    public void deleteAllUtilisateurs() {
        utilisateurRepository.deleteAll();
    }

    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return null;
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return null;
    }

    @Override
    public Utilisateur getUtilisateurtById(Long id) {
        return utilisateurRepository.findById(id).get();
    }


    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur updateUtilisateur(Long utilisateurId, Utilisateur utilisateur) {
        return utilisateur;
    }
}