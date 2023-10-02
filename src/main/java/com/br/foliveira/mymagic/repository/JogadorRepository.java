package com.br.foliveira.mymagic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.br.foliveira.mymagic.model.negocio.Jogador;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Long>{
    
}
