
package model;

import java.util.ArrayList;

public class Local {
    private int id;
    private String nome;
    private double taxaEmbarque; 
    private ArrayList<Funcionario> funcionarios;

    public Local() {
    }

    public Local(int id, String nome, double taxaEmbarque) {
        this.id = id;
        this.nome = nome;
        this.taxaEmbarque = taxaEmbarque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }
    
}
