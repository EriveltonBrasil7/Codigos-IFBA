
package model;

import java.util.ArrayList;

public class Autor extends Pessoa{
    private String ultimoNome;
    private String titulacao;
    private ArrayList<Obra> obras;

    public Autor() {
    }

    public Autor(String ultimoNome, String titulacao, ArrayList<Obra> obras, int id, String nome, String cpf) {
        super(id, nome, cpf); //invocando o método construtor cheio, da super classe
        this.ultimoNome = ultimoNome;
        this.titulacao = titulacao;
        this.obras = obras;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    
}
