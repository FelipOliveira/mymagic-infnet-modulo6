package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Carta;

public interface CartaService {
    public Carta salvar(Carta carta);
    public List<Carta> listar();
}
