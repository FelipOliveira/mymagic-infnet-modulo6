package com.br.foliveira.mymagic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.foliveira.mymagic.model.negocio.Carta;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Integer>{
    
}
