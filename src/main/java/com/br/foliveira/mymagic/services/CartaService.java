package com.br.foliveira.mymagic.services;

import java.util.List;
import java.util.Optional;

import com.br.foliveira.mymagic.model.negocio.Carta;

public interface CartaService {
    public Carta salvar(Carta carta);
    public List<Carta> listar();
    public Optional<Carta> buscarPorID(int id);
    public void deletarCarta(int id);
    public void editarCarta(int id, Carta carta);
}
