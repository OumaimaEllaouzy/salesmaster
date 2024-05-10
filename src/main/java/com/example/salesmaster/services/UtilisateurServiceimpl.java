package com.example.salesmaster.services;

import com.example.salesmaster.entities.Utilisateur;
import com.example.salesmaster.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceimpl implements UtilisateurService{

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Long id,Utilisateur utilisateur) {
        Utilisateur utilisateurFound = getUtilisateurById(id);
        return utilisateurRepository.save(utilisateurFound);
    }

    @Override
    public void deleteUtilisateurById(Long id) {
        Utilisateur utilisateur=getUtilisateurById(id);
        utilisateurRepository.delete(utilisateur);
    }

    @Override
    public void deleteAllUtilisateurs() {
        utilisateurRepository.deleteAll();
    }

    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("utilisateur Does not exist !"));

    }
    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

}
