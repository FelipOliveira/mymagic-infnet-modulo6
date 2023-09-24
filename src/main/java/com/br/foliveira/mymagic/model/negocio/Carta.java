package com.br.foliveira.mymagic.model.negocio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Carta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nome;
    private Cor cor;

    public Carta(int codigo, String nome, Cor cor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
    }

    public Carta() {
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
