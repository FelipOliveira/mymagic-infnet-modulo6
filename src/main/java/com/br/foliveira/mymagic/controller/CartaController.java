package com.br.foliveira.mymagic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/cartas/{carta_id}")
    public Optional<Carta> buscarCarta(@PathVariable("carta_id") int id){
        return cartaService.buscarPorID(id);
    }
    
    @PostMapping("/adicionarcarta")
    public String novaCarta(@RequestBody Carta carta) {
        cartaService.salvar(carta);
        return carta.getNome() + " adicionado(a).";
    }

    @PutMapping("/cartas/{carta_id}")
    public String alterarCarta(@PathVariable("carta_id") int id, @RequestBody Carta carta){
        cartaService.editarCarta(id, carta);
        return "Carta alterada.";
    }

    @DeleteMapping("/cartas/{carta_id}")
    public String deletarCarta(@PathVariable("carta_id") int id){
        cartaService.deletarCarta(id);
        return "Carta excluída.";
    }

    // terrenos
    @GetMapping("/terrenos")
    public List<Terreno> listarTerrenos(){
        return terrenoService.listar();
    }
    
    @PostMapping("/adicionarterreno")
    public String novoTerreno(@RequestBody Terreno terreno) {
        terrenoService.salvar(terreno);
        return terreno.getNome() + " adicionado(a).";
    }
    
    // criaturas
    @GetMapping("/criaturas")
    public List<Criatura> listarCriaturas(){
        return criaturaService.listar();
    }

    @PostMapping("/adicionarcriatura")
    public String novaCriatura(@RequestBody Criatura criatura) {
        criaturaService.salvar(criatura);
        return criatura.getNome() + " adicionado(a).";
    }

    // artefatos
    @GetMapping("/artefatos")
    public List<Artefato> listarArtefatos(){
        return artefatoService.listar();
    }

    @PostMapping("/adicionarartefato")
    public String novoArtefato(@RequestBody Artefato artefato) {
        artefatoService.salvar(artefato);
        return artefato.getNome() + " adicionado(a).";
    }

}
