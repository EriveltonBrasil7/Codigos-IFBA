package model;

import java.util.Date;

public class Cliente extends Pessoa {
    private int pontosFidelidade;
    private boolean adimplente;

    public Cliente() {
    }

    public Cliente(int pontosFidelidade, boolean adimplente, int id, String nome, String sexo, String cpf, String rg, Date dataNascimento, Endereco enderResidencial) {
        super(id, nome, sexo, cpf, rg, dataNascimento, enderResidencial);
        this.pontosFidelidade = pontosFidelidade;
        this.adimplente = adimplente;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public boolean getAdimplente() {
        return adimplente;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }
    
}
