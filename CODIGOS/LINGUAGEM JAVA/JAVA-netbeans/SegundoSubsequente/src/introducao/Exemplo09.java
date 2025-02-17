package introducao;

import java.util.Scanner;

public class Exemplo09 {

    public static void main(String[] args) {
        int brasil, eua, italia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de medalhas do Brasil:");
        brasil = teclado.nextInt();

        System.out.print("Digite o número de medalhas dos EUA:");
        eua = teclado.nextInt();

        System.out.print("Digite o número de medalhas da Itália:");
        italia = teclado.nextInt();

        if (brasil > italia && brasil > eua) {
            System.out.println("O Brasil tem o maior número de medalhas dos três paises!");
        } else if (italia > brasil && italia > eua) {
            System.out.println("A Itália tem o maior número de medalhas dos Três paises!");
        } else if (eua > brasil && eua > italia) {
            System.out.println("Os EUA tem o maior número de medalhas dos três paises!");
        } else if (brasil == italia && brasil == eua && eua == italia) {
            System.out.println("Os três paises tem o mesmo número de medalhas!!");
        }
    }
