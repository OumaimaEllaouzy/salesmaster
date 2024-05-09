package com.example.salesmaster.services;

import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VenteServiceimpl implements VenteService{
    private VenteRepository venteRepository;



    @Autowired
    public VenteServiceimpl(VenteRepository venteRepository) {
        this.venteRepository = venteRepository;
    }
    @Override
    public Vente saveVente(Vente vente) {
        return venteRepository.save(vente);
    }


    @Override
    public Vente updateVente(Vente vente) {
        return venteRepository.save(vente);
    }


    @Override
    public void deleteVenteById(Long id) {
        venteRepository.deleteById(id);   }


    @Override
    public void deleteAllVentes() {
        venteRepository.deleteAll();
    }

    @Override
    public Vente getVenteById(Long id) {
        return null;
    }

    @Override
    public Vente getVentetById(Long id) {
        return venteRepository.findById(id).get();
    }


    @Override
    public List<Vente> getAllVentes() {
        return venteRepository.findAll();
    }

    @Override
    public VenteService saveVenteService(VenteService venteservice) {
        return null;
    }

    @Override
    public VenteService updateVenteService(VenteService venteservice) {
        return null;
    }

    @Override
    public void deleteVenteServiceById(Long id) {

    }

    @Override
    public void deleteAllVentesService() {

    }

    @Override
    public VenteService getVenteServiceById(Long id) {
        return null;
    }

    @Override
    public List<VenteService> getAllVentesService() {
        return null;
    }

    public Vente updateVente(Long venteId, Vente vente) {
        return vente;
    }

    public List<Vente> getAllVente() {
        return null;
    }
}