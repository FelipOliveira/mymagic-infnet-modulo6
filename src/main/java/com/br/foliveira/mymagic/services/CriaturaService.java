package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Criatura;

public interface CriaturaService {
    public Criatura salvar(Criatura criatura);
    public List<Criatura> listar();
}
