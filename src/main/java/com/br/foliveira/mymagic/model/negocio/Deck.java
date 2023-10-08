package com.br.foliveira.mymagic.model.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TDeck")
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String nome;
    
    @ManyToMany(mappedBy = "decks")
    private List<Carta> cartas = new ArrayList<Carta>();

    @OneToOne(mappedBy = "deck")
    @JsonIgnore
    private Jogador jogador;

    public Deck(String nome) {
        this.nome = nome;
    }

    public Deck(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public Long getId() {
        return id;
    }

    @Override
	public String toString() {
		return "\nnome:\t" + nome + "\ncartas:\t" + cartas.toString();
	}
}
