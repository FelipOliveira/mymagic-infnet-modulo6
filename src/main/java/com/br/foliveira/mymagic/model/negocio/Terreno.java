package com.br.foliveira.mymagic.model.negocio;

import javax.persistence.Entity;

@Entity
public class Terreno extends Carta{
    
    private int qtdeMana;

    public Terreno(int codigo, String nome, Cor cor, int qtdeMana){
        super(codigo, nome, cor);
        this.qtdeMana = qtdeMana;
    }

    public int getQtdeMana() {
        return qtdeMana;
    }
    public void setQtdeMana(int qtdeMana) {
        this.qtdeMana = qtdeMana;
    }

    @Override
	public String toString() {
		return super.toString() + "\nmana gerada:\t" + qtdeMana;
	}
}
