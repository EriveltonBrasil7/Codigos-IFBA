package model;


public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpfCnpj;
    private String email;
    private String celular;
    private Endereco enderecoResidencial;
    

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpfCnpj, String email, String celular, Endereco enderecoResidencial) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.celular = celular;
        this.enderecoResidencial = enderecoResidencial;
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    
   
    
    
}
