package model;

import java.util.Date;

public class Funcionario extends Pessoa{
    private double salario;
    private String numCtps;
    private Date dataAdmissao;
    private Cargo cargo;
    
    public void setCargo(Cargo cargo){
        this.cargo = cargo;      
    }
    public Cargo getCargo(){
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumCtps() {
        return numCtps;
    }

    public void setNumCtps(String numCtps) {
        this.numCtps = numCtps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
}
