package com.br.foliveira.mymagic.model.negocio;

public class Criatura extends Carta{
    private int poder;
    private int resistencia;
    private String texto;
    private int custo;

    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    @Override
	public String toString() {
		return super.toString() + "\ncusto:\t" + custo + "\npoder:\t" + poder + "\nresistência:\t" + resistencia + "\ntexto:\t" + texto;
	}
}
