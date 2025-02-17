/*
 */
package introducao_oo;

public class Cliente {

    String nome;
    String cpf;
    double salario;

    public Cliente() {
        
    }

    public Cliente(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void imprimirTodosDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario);
    }

}
