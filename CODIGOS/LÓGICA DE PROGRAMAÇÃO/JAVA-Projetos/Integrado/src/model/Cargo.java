package model;

public class Cargo {
    private int codigo;
    private String nome;
    private String descricao;
    private double auxAlimentacao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getAuxAlimentacao() {
        return auxAlimentacao;
    }

    public void setAuxAlimentacao(double auxAlimentacao) {
        this.auxAlimentacao = auxAlimentacao;
    }
    
    
}
