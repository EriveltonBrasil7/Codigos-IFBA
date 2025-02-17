package paradigma_orientado_objetos;

public class Funcionario extends Pessoa{
    private double salario;
    private String funcao;

    public Funcionario(double salario, String funcao) {
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
    

}
