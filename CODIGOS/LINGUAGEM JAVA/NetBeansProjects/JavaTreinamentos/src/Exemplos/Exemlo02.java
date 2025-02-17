package Exemplos;

import java.util.Scanner;

public class Exemlo02 {

    public static void main(String[] args) {
        byte brasil, eua, italia;
        int totalMedalhas;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de medalhas do Brasil:");
        brasil = teclado.nextByte();

        System.out.print("Digite o número de medalhas dos EUA:");
        eua = teclado.nextByte();

        System.out.print("Digite o número de medalhas da Itália:");
        italia = teclado.nextByte();
        totalMedalhas = eua + brasil + italia;

        if (brasil > eua && brasil > italia) {
            System.out.println("O Brasil tem o maior número de medalhas com o total de " + brasil + " medalhas!");
        } else if (eua > brasil && eua > italia) {
            System.out.println("Os EUA tem o maior número de medalhas com o total de " + eua + " medalhas!");
        } else if (italia > eua && italia > brasil) {
            System.out.println("A Itália tem o maior número de medalhas com o total de " + italia + " medalhas!");
        } else if (italia == brasil && italia == eua && brasil == eua) {
            System.out.println("Os três países tem a mesma medalhas, total de " + totalMedalhas + "!");
        }
    }
}
