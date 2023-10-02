package com.br.foliveira.mymagic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.br.foliveira.mymagic.model.negocio.Carta;

@Repository
public interface CartaRepository extends CrudRepository<Carta, Integer>{
    
}
