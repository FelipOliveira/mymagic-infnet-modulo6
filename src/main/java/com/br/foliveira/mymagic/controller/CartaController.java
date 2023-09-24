package com.br.foliveira.mymagic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.foliveira.mymagic.model.negocio.Artefato;
import com.br.foliveira.mymagic.model.negocio.Carta;
import com.br.foliveira.mymagic.model.negocio.Criatura;
import com.br.foliveira.mymagic.model.negocio.Terreno;
import com.br.foliveira.mymagic.services.ArtefatoService;
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
    
    @Autowired
    private ArtefatoService artefatoService;
    
    // cartas
    @GetMapping("/cartas")
    public List<Carta> listarCartas(){
        return cartaService.listar();
    }
    
    @PostMapping("/adicionarcarta")
    String novaCarta(@RequestBody Carta carta) {
        cartaService.salvar(carta);
        return carta.getNome() + " adicionado(a).";
    }

    // terrenos
    @GetMapping("/terrenos")
    public List<Terreno> listarTerrenos(){
        return terrenoService.listar();
    }
    
    @PostMapping("/adicionarterreno")
    String novoTerreno(@RequestBody Terreno terreno) {
        terrenoService.salvar(terreno);
        return terreno.getNome() + " adicionado(a).";
    }
    
    // criaturas
    @GetMapping("/criaturas")
    public List<Criatura> listarCriaturas(){
        return criaturaService.listar();
    }

    @PostMapping("/adicionarcriatura")
    String novaCriatura(@RequestBody Criatura criatura) {
        criaturaService.salvar(criatura);
        return criatura.getNome() + " adicionado(a).";
    }

    // artefatos
    @GetMapping("/artefatos")
    public List<Artefato> listarArtefatos(){
        return artefatoService.listar();
    }

    @PostMapping("/adicionarartefato")
    String novoArtefato(@RequestBody Artefato artefato) {
        artefatoService.salvar(artefato);
        return artefato.getNome() + " adicionado(a).";
    }

}
