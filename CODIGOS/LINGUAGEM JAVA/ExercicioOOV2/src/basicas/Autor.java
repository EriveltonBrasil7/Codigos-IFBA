package basicas;

import java.util.ArrayList;

public class Autor {

    private int id;
    private String nome;
    private String ultimoNome;
    private String cpf;
    private String titulacao;
    private ArrayList<Obra> obras;

    public Autor(int id, String nome, String ultimoNome, String cpf, String titulacao, ArrayList<Obra> obras) {
        this.id = id;
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.obras = obras;
    }

    public Autor() {

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

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

}
