package model;

public class Cargo {
    private int codigo;
    private String nome;
    private String descricao;
    private double auxAlimentacao;
    private String tipo;
    private double preco;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

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
