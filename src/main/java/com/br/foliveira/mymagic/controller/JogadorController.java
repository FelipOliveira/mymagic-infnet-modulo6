package com.br.foliveira.mymagic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.foliveira.mymagic.model.negocio.Jogador;
import com.br.foliveira.mymagic.services.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    
    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public List<Jogador> listarJogadores(){
        return jogadorService.listar();
    }
    
    @PostMapping
    public String novoJogador(@RequestBody Jogador jogador) {
        jogadorService.salvar(jogador);
        return jogador.getNome() + " adicionado(a).";
    }
}
