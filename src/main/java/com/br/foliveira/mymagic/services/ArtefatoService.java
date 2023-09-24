package com.br.foliveira.mymagic.services;

import java.util.List;

import com.br.foliveira.mymagic.model.negocio.Artefato;

public interface ArtefatoService {
    public Artefato salvar(Artefato artefato);
    public List<Artefato> listar();
}
