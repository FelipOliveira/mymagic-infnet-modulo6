package com.br.foliveira.mymagic.model.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TCarta")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Carta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Cor cor;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "carta_deck", 
      joinColumns = @JoinColumn(name = "deck_id", referencedColumnName = "id"), 
      inverseJoinColumns = @JoinColumn(name = "carta_id", 
      referencedColumnName = "id"))
    private List<Deck> decks;

    public Carta(int codigo, String nome, Cor cor) {
        this.id = codigo;
        this.nome = nome;
        this.cor = cor;
    }

    public Carta() {
    }

    public int getId() {
        return id;
    }
    public void setId(int codigo) {
        this.id = codigo;
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
    public List<Deck> getDecks() {
        return decks;
    }
    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    @Override
	public String toString() {
		return "\nnome:\t"+ nome + "\ncor:\t" + cor;
	}
}
