package com.br.foliveira.mymagic.model.negocio;

public class Artefato extends Carta{
    private boolean equipamento;
    private String habilidade;
    private int custo;

    public boolean isEquipamento() {
        return equipamento;
    }
    public void setEquipamento(boolean equipamento) {
        this.equipamento = equipamento;
    }
    public String getHabilidade() {
        return habilidade;
    }
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    @Override
	public String toString() {
		return super.toString() + "\ncusto:\t" + custo + "\nequipamento:\t" + equipamento;
	}
}
