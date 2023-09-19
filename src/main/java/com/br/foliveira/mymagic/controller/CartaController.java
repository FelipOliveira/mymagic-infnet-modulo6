package com.br.foliveira.mymagic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.foliveira.mymagic.model.negocio.Carta;
import com.br.foliveira.mymagic.model.negocio.Criatura;
import com.br.foliveira.mymagic.model.negocio.Terreno;
import com.br.foliveira.mymagic.services.CartaService;
import com.br.foliveira.mymagic.services.CriaturaService;
import com.br.foliveira.mymagic.services.TerrenoService;

@RestController
@RequestMapping("/")
public class CartaController {
    
    @Autowired
    private CartaService cartaService;

    @Autowired
    private TerrenoService terrenoService;

    @Autowired
    private CriaturaService criaturaService;

    @GetMapping("/cartas")
    public List<Carta> listarCartas(){
        return cartaService.listar();
    }

    @GetMapping("/terrenos")
    public List<Terreno> listarTerrenos(){
        return terrenoService.listar();
    }

    @GetMapping("/criaturas")
    public List<Criatura> listarCriaturas(){
        return criaturaService.listar();
    }

    @PostMapping("/adicionar")
	String novaCarta(@RequestBody Carta carta) {
		cartaService.salvar(carta);
        return carta.getNome() + " adicionado(a).";
	}
}
