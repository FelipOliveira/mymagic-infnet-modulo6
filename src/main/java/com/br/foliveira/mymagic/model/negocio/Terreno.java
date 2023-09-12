package com.br.foliveira.mymagic.model.negocio;

public class Terreno extends Carta{
    private int qtdeMana;

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
