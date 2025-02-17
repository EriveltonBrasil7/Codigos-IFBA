package model;
public class Cargo {
    private int id;
    private String nome;
    private String atribuicoes;

    public Cargo() {
    }

    public Cargo(int id, String nome, String atribuicoes) {
        this.id = id;
        this.nome = nome;
        this.atribuicoes = atribuicoes;
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

    public String getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(String atribuicoes) {
        this.atribuicoes = atribuicoes;
    }
    
}
