package com.br.foliveira.mymagic.model.negocio;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jogador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String nome;
    private LocalDateTime dataRegistro;
    private Deck deck;

    public Jogador(String nome, Deck deck){
        this.nome = nome;
        this.dataRegistro = LocalDateTime.now();
        this.deck = deck;
    }

    public Jogador(){
        this.dataRegistro = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString(){
        return "\nnome:\t" + nome + "\ndata de registro:\t" + dataRegistro + "\ndeck;\t" + deck.getNome();
    }
}
