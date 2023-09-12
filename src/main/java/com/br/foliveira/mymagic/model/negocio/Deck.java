package com.br.foliveira.mymagic.model.negocio;

import java.util.List;

public class Deck {
    private String nome;
    private List<Carta> cartas;

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
    public void adicionarCarta(Carta carta){
        cartas.add(carta);
    }
    public void removerCarta(int index){
        cartas.remove(index);
    }

    @Override
	public String toString() {
		return "\nnome:\t" + nome + "\ncartas:\t" + cartas.toString();
	}
}
