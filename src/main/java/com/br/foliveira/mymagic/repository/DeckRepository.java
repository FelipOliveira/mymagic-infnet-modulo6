package com.br.foliveira.mymagic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.br.foliveira.mymagic.model.negocio.Deck;

@Repository
public interface DeckRepository extends CrudRepository<Deck, Long>{
    
}
