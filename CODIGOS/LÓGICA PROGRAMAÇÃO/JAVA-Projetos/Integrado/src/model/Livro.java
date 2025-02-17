package model;

public class Livro {
    //atributos
    private String ano;
    private String nome;
    private String edicao;

    //Método Construtor vazio
    public Livro(){
        
    }
    //método construtor completo
    public Livro(String ano, String nome, String edicao){
       this.ano = ano; 
       this.nome = nome;
       this.edicao = edicao;
    }
    public Livro(String edicao, String nome){
        this.edicao = edicao;
        this.nome = nome;
    }
    
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    
}
