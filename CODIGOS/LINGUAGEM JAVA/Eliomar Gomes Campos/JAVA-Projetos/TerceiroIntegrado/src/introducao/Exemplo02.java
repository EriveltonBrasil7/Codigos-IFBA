package introducao;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        float nota1, nota2, soma;
        String nomeAluno;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome Aluno: ");
        nomeAluno = teclado.nextLine();
        
        System.out.print("Nota 1: ");
        nota1 = teclado.nextFloat();
        
        System.out.print("Nota 2: ");
        nota2 = teclado.nextFloat();
        soma = nota1 + nota2;
        
        System.out.println("Resultado: "+soma);
        
    }
}
