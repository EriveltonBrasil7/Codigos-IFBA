package Exemplos;

import java.util.Scanner;

public class desafioSilvio {

    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, resultadoSoma;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um numero inteiro: ");
        primeiroNumero = teclado.nextInt();

        System.out.print("Escreva outro numero inteiro: ");
        segundoNumero = teclado.nextInt();

        if (segundoNumero > primeiroNumero) {
            resultadoSoma = (primeiroNumero + segundoNumero) / primeiroNumero;
            System.out.println(resultadoSoma);
            
        } else if(primeiroNumero > segundoNumero) {
            resultadoSoma = (primeiroNumero + segundoNumero) / segundoNumero;
            System.out.println(resultadoSoma);
        }
    }

}


