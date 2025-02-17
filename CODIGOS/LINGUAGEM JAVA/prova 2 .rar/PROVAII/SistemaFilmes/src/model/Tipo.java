package model;

import java.util.ArrayList;

public class Tipo {
    private int id;
    private String nome;
    private double valorAcrescimento;
    private ArrayList<Midia> midias;

    public Tipo() {
    }

    public Tipo(int id, String nome, double valorAcrescimento, ArrayList<Midia> midias) {
        this.id = id;
        this.nome = nome;
        this.valorAcrescimento = valorAcrescimento;
        this.midias = midias;
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

    public double getValorAcrescimento() {
        return valorAcrescimento;
    }

    public void setValorAcrescimento(double valorAcrescimento) {
        this.valorAcrescimento = valorAcrescimento;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }
    
}
