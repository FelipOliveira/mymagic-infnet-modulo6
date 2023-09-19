package com.br.foliveira.mymagic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.foliveira.mymagic.model.negocio.Criatura;

@Repository
public interface CriaturaRepository extends JpaRepository<Criatura, Integer>{
    
}
