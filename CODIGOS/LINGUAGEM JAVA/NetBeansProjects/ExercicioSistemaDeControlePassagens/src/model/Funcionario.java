
package model;

import java.util.Date;

public class Funcionario extends Pessoa {
   private Date dataAdmissao;
   private String funcao;
   private double salario;

    public Funcionario() {
    }

    public Funcionario(Date dataAdmissao, String funcao, double salario, int id, String nome, String cpf, String rg, Date nascimento, String sexo, String email, String celular, Endereco endereco) {
        super(id, nome, cpf, rg, nascimento, sexo, email, celular, endereco);
        this.dataAdmissao = dataAdmissao;
        this.funcao = funcao;
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
}
