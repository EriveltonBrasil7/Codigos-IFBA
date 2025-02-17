package introducao;

import java.util.Scanner;

public class Exemplo11 {

    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano atual:");
        anoAtual = teclado.nextInt();

        System.out.print("Digite o seu ano de nascimento:");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;

        if (idade >= 18 && idade <= 70) {
            System.out.println("Seu voto é obrigatório!");
        } else if (idade >= 16 && idade >70) {
            System.out.println("Seu voto é facultativo!");
        }else if(idade < 16){
            System.out.println("Seu voto é proibido!");
        }

    }
}
