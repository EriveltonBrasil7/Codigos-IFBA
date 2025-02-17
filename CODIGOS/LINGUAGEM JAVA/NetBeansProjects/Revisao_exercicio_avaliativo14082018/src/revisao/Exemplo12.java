package revisao;

import java.util.Scanner;

public class Exemplo12 {

    public static void main(String[] args) {
        int i, voto, votoLula = 0, votoBolsonaro = 0, votoMaia = 0;

        Scanner teclado = new Scanner(System.in);

        for (i = 1; i <= 6; i++) {
            System.out.println("Digite o seu voto: 13-Lula, 11-Bolsonaro e 45-Rodrigo M. :");
            voto = teclado.nextInt();

            if (voto == 13) {
                votoLula = votoLula + 1;
            } else if (voto == 11) {
                votoBolsonaro = votoBolsonaro + 1;
            } else if (voto == 45) {
                votoMaia = votoMaia + 1;
            }
        }
        if (votoLula > votoBolsonaro && votoLula > votoMaia) {
            System.out.println("Lula é o novo presidente!");
        } else if (votoBolsonaro > votoLula && votoBolsonaro > votoMaia) {
            System.out.println("Bolsonaro é o novo presidente!");
        } else if (votoMaia > votoLula && votoMaia > votoBolsonaro) {
            System.out.println("Rodrigo Maia é o novo presidente!");
        } else if (votoLula == votoBolsonaro && votoLula == votoMaia && votoBolsonaro == votoMaia) {
            System.out.println("Houve empate entre os candidatos!");
        }
        System.out.println("Apuração dos Resultados:");
        System.out.println("total de votos em Lula: " + votoLula);
        System.out.println("total de votos em Bolsonaro: " + votoBolsonaro);
        System.out.println("total de votos em Rodrigo Maia: " + votoMaia);
        System.out.println("total de votos: " + (votoLula + votoBolsonaro + votoMaia));

    }
}
