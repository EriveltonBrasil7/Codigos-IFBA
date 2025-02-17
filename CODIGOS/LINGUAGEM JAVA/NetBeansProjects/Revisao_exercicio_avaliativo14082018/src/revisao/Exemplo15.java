package revisao;

import java.util.Scanner;

public class Exemplo15 {

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10:");
        numero = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" X "+i+" = "+(numero*i));
        }
    }
}
