package model;

import java.util.Date;

public class Funcionario extends Pessoa{
    private double salario;
    private String numeroCtps;
    private Date dataAdmissao;
    private Cargo cargo;
    private Usuario usuario;

    public Funcionario() {
    }

    public Funcionario(double salario, String numeroCtps, Date dataAdmissao, Cargo cargo, Usuario usuario, int id, String nome, String sexo, String cpf, String rg, Date dataNascimento, Endereco enderResidencial) {
        super(id, nome, sexo, cpf, rg, dataNascimento, enderResidencial);
        this.salario = salario;
        this.numeroCtps = numeroCtps;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumeroCtps() {
        return numeroCtps;
    }

    public void setNumeroCtps(String numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
