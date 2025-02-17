package Questoes;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int i, voto, votoLula = 0, votoBolsonaro = 0, votoJoao = 0;

        Scanner teclado = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite 13-Lula, 17-Bolsonaro ou 30-João Amoêdo: ");
            voto = teclado.nextInt();
            
            if (voto == 13) {
                votoLula = votoLula + 1;
            } else if (voto == 17) {
                votoBolsonaro = votoBolsonaro + 1;
            } else if (voto == 30) {
                votoJoao = votoJoao + 1;
            }
        }
        if (votoLula > votoBolsonaro && votoLula > votoJoao) {
            System.out.println("\n Lula é o novo presidente!\n");
        } else if (votoBolsonaro > votoLula && votoBolsonaro > votoJoao) {
            System.out.println("\nBolsonaro é o novo presidente!\n");
        } else if (votoJoao > votoLula && votoJoao > votoBolsonaro) {
            System.out.println("\nJoão Amoêdo é o novo presidente!\n");
        }
        System.out.println("Apuração total dos votos: ");
        System.out.println("total de votos em Lula:" + votoLula);
        System.out.println("total de votos em Bolsonaro: " + votoBolsonaro);
        System.out.println("total de votos em João Amoêdo: " + votoJoao);
        System.out.println("total de votos:" + (votoLula + votoBolsonaro + votoJoao));
    }
}
