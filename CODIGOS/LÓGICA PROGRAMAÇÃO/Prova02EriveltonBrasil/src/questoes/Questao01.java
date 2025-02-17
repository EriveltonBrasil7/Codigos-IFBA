package questoes;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        double media = 0;
        int maior = 0, num = 0, soma = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os números:");
        for (int i = 0; i < vetor.length; i++) {
            num = ler.nextInt();
            vetor[i] = num;
            soma += num;
            media = soma / 3;
        }
        int menor = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

            if (vetor[i] > maior) {
                maior = vetor[i];
            } else {
                menor = vetor[i];
            }
        }
        System.out.println(" ");
        System.out.println("--RESULTADO COLETADO--");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);
    }
}
