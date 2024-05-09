package com.example.salesmaster.services;
import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.repositories.LigneDeVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LigneDeVenteServiceimpl implements LigneDeVenteService{
    @Autowired
    private LigneDeVenteRepository ligneDeVenteRepository;

    @Override
    public LigneDeVente saveLigneDeVente(return ligneDeVenteRepository.save(ligneDeVente); {
    }

    @Override
    public LigneDeVente saveLigneDeVente(LigneDeVente ligneDeVente) {
        return null;
    }

    @Override
    public LigneDeVente updateLigneDeVente(Long id,LigneDeVente ligneDeVente) {
        LigneDeVente ligneDeVenteFound = getLigneDeVenteById(id);
        return ligneDeVenteRepository.save(ligneDeVenteFound);
    }

        @Override
        public void deleteLigneDeVenteById(Long id) {
            LigneDeVente ligneDeVente =getLigneDeVenteById(id);
            ligneDeVenteRepository.delete(ligneDeVente);

        }

        @Override
        public void deleteAllLigneDeVentes() {ligneDeVenteRepository.deleteAll();

        }

        @Override
        public LigneDeVente getLigneDeVenteById(Long id) {
            return null;
        }

        @Override
        public List<LigneDeVente> getAllLigneDeVente() {
            return ligneDeVenteRepository.findAll();
        }
    }

    @Override
    public void deleteLigneDeVenteById(Long id) {

    }

    @Override
    public void deleteAllLigneDeVentes() {

    }

    @Override
    public LigneDeVente getLigneDeVenteById(Long id) {
        return null;
    }

    @Override
    public List<LigneDeVente> getAllLigneDeVente() {
        return null;
    }


}

@Override
public void deleteAllLignesDeVente() { ligneDeVenteRepository.deleteteAll();

}

@Override
public LigneDeVente getLigneDeVenteById(Long id) {
    return ligneDeVenteRepository.findById(id);
         .orElseThrow(() -> new RuntimeException("ligneDeVente Does not exist !"))
}

public List<LigneDeVente> getAllLigneDeVente() {
    return ligneDeVenteRepository.findAll();
}

}