package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.foliveira.mymagic.model.negocio.Terreno;
import com.br.foliveira.mymagic.repository.TerrenoRepository;

@Service
public class TerrenoServiceImpl implements TerrenoService{

    @Autowired
    private TerrenoRepository repository;

    @Override
    public Terreno salvar(Terreno terreno) {
        return repository.save(terreno);
    }

    @Override
    public List<Terreno> listar() {
        return (List<Terreno>) repository.findAll();
    }
    
}
