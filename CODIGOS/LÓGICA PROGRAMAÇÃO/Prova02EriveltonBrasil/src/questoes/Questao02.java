package questoes;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
//        int [] vetor = {0,1,1,2,3,5,8,13,21,34};
        int i, numero, soma = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o vigesimo primeiro número de FIBONACCI:");
        numero = teclado.nextInt();

        for (i = 1; i <= numero; i++) {

            System.out.print(i + ", ");
            soma = numero + numero;
        }
        System.out.println(" = " + (i + soma));

    }
}
