package com.br.foliveira.mymagic.services;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Carta> buscarPorID(int id) {
        return repository.findById(id);
    }

    @Override
    public void deletarCarta(int id) {
        repository.deleteById(id);
    }

    @Override
    public void editarCarta(int id, Carta carta) {
        Optional<Carta> cartaData = repository.findById(id);
        if (cartaData.isPresent()) {
            Carta novaCarta = cartaData.get();
            novaCarta.setId(id);
            novaCarta.setNome(carta.getNome());
            novaCarta.setCor(carta.getCor());
            novaCarta.setDecks(cartaData.get().getDecks());
            repository.save(novaCarta);
        }
    }

    
}
