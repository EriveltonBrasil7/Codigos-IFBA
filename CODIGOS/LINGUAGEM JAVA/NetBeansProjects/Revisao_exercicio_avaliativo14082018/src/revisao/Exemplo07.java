package revisao;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu ano de Nascimento:");
        anoNascimento = teclado.nextInt();

        System.out.println("Digite o seu ano atual:");
        anoAtual = teclado.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 18 && idade <= 70) {
            System.out.println("Sua idade é "+idade+" anos, Seu voto é obrigatório!");
        } else if (idade >= 16 && idade > 70) {
            System.out.println("Sua idade é "+idade+" anos, Seu voto é facultativo!");
        }else if(idade <16){
            System.out.println("Sua idade é "+idade+" anos, Seu voto é proibido!");
        }
    }
}
