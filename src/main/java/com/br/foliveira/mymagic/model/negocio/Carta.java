package com.br.foliveira.mymagic.model.negocio;

public abstract class Carta {
    private int codigo;
    private String nome;
    private Cor cor;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
	public String toString() {
		return "código\t " + codigo +"\nnome:\t"+ nome + "\ncor:\t" + cor;
	}
}
