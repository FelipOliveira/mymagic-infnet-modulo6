package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.foliveira.mymagic.model.negocio.Artefato;
import com.br.foliveira.mymagic.repository.ArtefatoRepository;

@Service
public class ArtefatoServiceImpl implements ArtefatoService{

    @Autowired
    private ArtefatoRepository repository;

    @Override
    public Artefato salvar(Artefato artefato) {
        return repository.save(artefato);
    }

    @Override
    public List<Artefato> listar() {
        return repository.findAll();
    }
    
}
