package Questoes;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int i, numero, soma = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número:");
        numero = teclado.nextInt();

        for (i = 1; i <= numero; i ++) {
            
            System.out.print(i+"+");
            soma = numero + numero;
           
            
        }System.out.println("= "+(i+soma));
    }
}
