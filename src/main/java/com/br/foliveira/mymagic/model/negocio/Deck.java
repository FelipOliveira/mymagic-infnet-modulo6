package com.br.foliveira.mymagic.model.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String nome;
    
    //TODO: resolver o problema de mapeamento de List
    private List<Carta> cartas = new ArrayList<Carta>();

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

    @Override
	public String toString() {
		return "\nnome:\t" + nome + "\ncartas:\t" + cartas.toString();
	}
}
