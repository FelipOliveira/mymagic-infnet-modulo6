package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Terreno;

public interface TerrenoService {
    public Terreno salvar(Terreno terreno);
    public List<Terreno> listar();
}
