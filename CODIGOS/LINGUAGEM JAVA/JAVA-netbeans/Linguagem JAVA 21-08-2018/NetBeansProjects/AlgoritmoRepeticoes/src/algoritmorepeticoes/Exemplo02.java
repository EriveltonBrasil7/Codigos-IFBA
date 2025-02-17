package algoritmorepeticoes;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        float altura, maior, menor;
        int i;
        altura = 0;
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i <= 3; i++) {
            System.out.println("Digite sua altura:");
            altura = teclado.nextFloat();

        }
        maior = 0;
        menor = altura;
        for (i = 0; i <= 3; i++) {
            if (altura > maior) {
                maior = altura;
                if (altura < menor) {
                    menor = altura;
                }
            }
        }
        System.out.println("A maior altura é"+maior);
        System.out.println("A menor altura é "+menor);
    }
}
