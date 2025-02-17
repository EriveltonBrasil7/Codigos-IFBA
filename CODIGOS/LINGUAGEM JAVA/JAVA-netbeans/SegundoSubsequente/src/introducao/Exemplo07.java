package introducao;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {
        Integer anoAtual;
        int anoNascimento, resultado, idade;
        String nomeUsuario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome:");
        nomeUsuario = teclado.nextLine();
        //Boas Vindas
        System.out.println("Seja bem Vindo(a)" + nomeUsuario + "!!");

        System.out.print("Digite o seu ano de nascimento:");
        anoNascimento = teclado.nextInt();

        System.out.print("Digite o seu ano atual:");
        anoAtual = teclado.nextInt();

        resultado = anoAtual - anoNascimento;
        idade = resultado;

        if (resultado > 60) {
            System.out.println(nomeUsuario + ",sua idade é " + idade + ",você está muito velho!");
        } else if (resultado >= 40 && resultado <= 60) {
            System.out.println(nomeUsuario + ",sua idade é " + idade + ",você está coroa ficando velho!");
        } else if (resultado < 40) {
            System.out.println(nomeUsuario + ",sua idade é " + idade + ",você é jovem ainda mas amanhã velho será!");
        }

    
}
