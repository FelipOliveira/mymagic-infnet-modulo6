package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Jogador;

public interface JogadorService {
    public Jogador salvar(Jogador jogador);
    public List<Jogador> listar();
}
