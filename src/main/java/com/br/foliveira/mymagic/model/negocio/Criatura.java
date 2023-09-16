package com.br.foliveira.mymagic.model.negocio;

public class Criatura extends Carta{
    
    private int poder;
    private int resistencia;
    private String texto;
    private int custo;
    
    public Criatura(int codigo, String nome, Cor cor, int poder, int resistencia, String texto, int custo) {
        super(codigo, nome, cor);
        this.poder = poder;
        this.resistencia = resistencia;
        this.texto = texto;
        this.custo = custo;
    }

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
