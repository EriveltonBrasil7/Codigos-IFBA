package model;

import java.util.Date;

public class Funcionario extends Pessoa{
    private double salario;
    private Date dataAdmissao;
    private Funcionario chefe;
    private Funcao cargo;

    public Funcionario() {
    }

    public Funcionario(double salario, Date dataAdmissao, Funcionario chefe, Funcao cargo, int id, String nome, String cpfCnpj, String email, String celular, Endereco enderecoResidencial) {
        super(id, nome, cpfCnpj, email, celular, enderecoResidencial);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.chefe = chefe;
        this.cargo = cargo;
    }

    

    public Funcao getCargo() {
        return cargo;
    }

    public void setCargo(Funcao cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
    
    
    
}
