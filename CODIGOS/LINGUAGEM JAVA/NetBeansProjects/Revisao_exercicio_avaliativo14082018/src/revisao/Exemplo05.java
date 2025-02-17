package revisao;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        String nomeUsuario;
        int anoNascimento, idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nomeUsuario = teclado.nextLine();

        System.out.println("Seja bem vindo(a) " + nomeUsuario);

        System.out.println("Digite o seu ano de nascimento:");
        anoNascimento = teclado.nextInt();

        idade = 2018 - anoNascimento;

        if (idade > 60) {
            System.out.println("Você está muito velho!");
        } else if (idade >= 40 && idade <= 60) {
            System.out.println("Você está coroa ficando velho!");
        } else if (idade < 40) {
            System.out.println("Você é jovem ainda amanhã velho será!");
        }
    }

}
