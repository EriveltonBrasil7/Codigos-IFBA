package revisao;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        String nomeDisciplina;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome da Disciplina:");
        nomeDisciplina = teclado.nextLine();

        System.out.println("Digite sua primeira nota:");
        nota1 = teclado.nextFloat();

        System.out.println("Digite sua segunda nota:");
        nota2 = teclado.nextFloat();

        System.out.println("Digite sua terceira nota:");
        nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Com a média de " + media + " na disciplina " + nomeDisciplina + ", você esta Aprovado!!");
            if (media == 10) {
                System.out.println("Meus parabéns!");
            }
        } else if (media < 6 && media >= 3) {
            System.out.println("Com a média de " + media + " na disciplina " + nomeDisciplina + ", você esta Reprovado, mas tem direito a recuperação!!");
        } else if (media < 3) {
            System.out.println("Com a média de " + media + " na disciplina " + nomeDisciplina + ", você esta reprovado e não tem direito a recuperação!!");
        }

    }
}
