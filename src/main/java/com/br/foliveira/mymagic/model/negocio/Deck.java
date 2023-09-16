package com.br.foliveira.mymagic.model.negocio;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    
    private String nome;
    private List<Carta> cartas;

    public Deck(String nome) {
        this.nome = nome;
        this.cartas = new ArrayList<Carta>();
    }

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
