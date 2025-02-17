package questoes;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int i, j, diagonal;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os números");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        System.out.println("MATRIZ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("DIAGONAL PRINCIPAL");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonal = matriz[i][j];
                    System.out.println("Diagonal principal: " + diagonal);
                }
            }
        }

    }
}
