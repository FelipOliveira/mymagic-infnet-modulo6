package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.foliveira.mymagic.model.negocio.Criatura;
import com.br.foliveira.mymagic.repository.CriaturaRepository;

@Service
public class CriaturaServiceImpl implements CriaturaService{

    @Autowired
    private CriaturaRepository repository;

    @Override
    public Criatura salvar(Criatura criatura) {
        return repository.save(criatura);
    }

    @Override
    public List<Criatura> listar() {
        return repository.findAll();
    }
    
}
