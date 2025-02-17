package introducao;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        float nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        nota1 = teclado.nextFloat();

        System.out.println("Digite a nota 2:");
        nota2 = teclado.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media < 6) {
            System.out.println("Lascou-se!");
        } else {
            System.out.println("não fez mais que sua obrigação!");
            if (media == 10) {
                System.out.println("Parabéns pela nota 10!");
            }
        }

    }
}
