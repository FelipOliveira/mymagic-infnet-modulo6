package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.foliveira.mymagic.model.negocio.Jogador;
import com.br.foliveira.mymagic.repository.JogadorRepository;

@Service
public class JogadorServiceImpl implements JogadorService{

    @Autowired
    private JogadorRepository repository;

    @Override
    public Jogador salvar(Jogador jogador) {
        return repository.save(jogador);
    }

    @Override
    public List<Jogador> listar() {
        return repository.findAll();
    }
    
}
