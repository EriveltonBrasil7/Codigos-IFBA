package model;

import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private List<Veiculo> veiculos;

    public Categoria() {
    }

    public Categoria(int id, String nome, List<Veiculo> veiculos) {
        this.id = id;
        this.nome = nome;
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
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
}
