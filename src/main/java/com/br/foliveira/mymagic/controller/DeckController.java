package com.br.foliveira.mymagic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.foliveira.mymagic.model.negocio.Deck;
import com.br.foliveira.mymagic.services.DeckService;

@RestController
@RequestMapping("/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @GetMapping
    public List<Deck> listarDecks(){
        return deckService.listar();
    }
    
    @PostMapping
    public String novoDeck(@RequestBody Deck deck){
        deckService.salvar(deck);
        return "deck salvo";
    }

}
