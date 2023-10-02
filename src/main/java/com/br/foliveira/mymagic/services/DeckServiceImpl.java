package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.foliveira.mymagic.model.negocio.Deck;
import com.br.foliveira.mymagic.repository.DeckRepository;

@Service
public class DeckServiceImpl implements DeckService{

    @Autowired
    private DeckRepository repository;

    @Override
    public Deck salvar(Deck deck) {
        return repository.save(deck);
    }

    @Override
    public List<Deck> listar() {
        return (List<Deck>) repository.findAll();
    }
    
}
