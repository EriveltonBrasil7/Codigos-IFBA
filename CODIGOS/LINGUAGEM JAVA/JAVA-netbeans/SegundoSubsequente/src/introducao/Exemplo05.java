package introducao;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        double nota1, nota2, resultado;
        //declarando a variável do tipo Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a Nota 1: ");
        nota1 = teclado.nextDouble();
        
        System.out.print("Digite a Nota 2: ");
        nota2 = teclado.nextDouble();
        
        resultado = (nota1 + nota2)/2;
        
        if(resultado < 6){
            System.out.println("Aluno Reprovado!");
        }else if(resultado >= 6){
            System.out.println("Aluno Aprovado!");   
            if(resultado == 10){
                System.out.println("Parabéns!");
            }
        }
        
    }
}
