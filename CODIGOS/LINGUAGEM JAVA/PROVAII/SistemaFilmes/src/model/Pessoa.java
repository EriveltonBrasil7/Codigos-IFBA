
package model;

import java.util.Date;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Endereco enderResidencial;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String sexo, String cpf, String rg, Date dataNascimento, Endereco enderResidencial) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.enderResidencial = enderResidencial;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEnderResidencial() {
        return enderResidencial;
    }

    public void setEnderResidencial(Endereco enderResidencial) {
        this.enderResidencial = enderResidencial;
    }
    
    
}
