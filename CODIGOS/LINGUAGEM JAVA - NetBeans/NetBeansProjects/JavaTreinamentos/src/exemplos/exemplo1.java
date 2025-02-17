package exemplos;

import java.util.Scanner;

public class exemplo1 {

    public static void main(String[] args) {
        int anoNascimento, anoAtual;
        String nomeUsuario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu Nome:");
        nomeUsuario = teclado.next();

        System.out.println("Seja bem vindo(a) " + nomeUsuario);

        System.out.println("Digite o seu Ano de Nascimento:");
        anoNascimento = teclado.nextInt();

        System.out.println("Digite o seu Ano Atual:");
        anoAtual = teclado.nextInt();

        anoNascimento = anoAtual - anoNascimento;

        if (anoNascimento > 60) {
            System.out.println(nomeUsuario + ", você está muito velho!! hehehhe");

        } else if (anoNascimento >= 40 && anoNascimento <= 60) {
            System.out.println(nomeUsuario + " você está coroa ficando velho.");

        } else if (anoNascimento < 40) {
            System.out.println(nomeUsuario + " você é jovem ainda, amanhã velho será.");
        }

    }

}
