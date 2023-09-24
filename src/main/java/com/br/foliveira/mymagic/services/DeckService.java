package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Deck;

public interface DeckService {
    public Deck salvar(Deck deck);
    public List<Deck> listar();
}
