package com.br.foliveira.mymagic.model.negocio;

public abstract class Carta {
    private int codigo;
    private String nome;
    private Cor cor;

    public Carta(int codigo, String nome, Cor cor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
    }

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
		return "\nnome:\t"+ nome + "\ncor:\t" + cor;
	}
}
