package com.br.foliveira.mymagic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.foliveira.mymagic.model.negocio.Carta;
import com.br.foliveira.mymagic.repository.CartaRepository;

@Service
public class CartaServiceImpl implements CartaService{
    
    @Autowired
    private CartaRepository repository;

    @Override
    public Carta salvar(Carta carta) {
        return repository.save(carta);
    }

    @Override
    public List<Carta> listar() {
        return (List<Carta>) repository.findAll();
    }

    
}
