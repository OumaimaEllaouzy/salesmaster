package com.example.salesmaster.repositories;

import com.example.salesmaster.entities.LigneDeVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeVenteRepository extends JpaRepository<LigneDeVente,Long > {
}
