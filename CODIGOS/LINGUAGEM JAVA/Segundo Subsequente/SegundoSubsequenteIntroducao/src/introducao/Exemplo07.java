package introducao;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {
        Integer anoAtual;
        int anoNascimento;
        String nomeUsuario;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o seu Nome? ");
        nomeUsuario = teclado.nextLine();
        System.out.println("Seja bem-vindo, "+nomeUsuario+"!");
        
        System.out.print("Ano Atual: ");
        anoAtual = teclado.nextInt();
        
        System.out.print("Ano de Nascimento: ");
        anoNascimento = teclado.nextInt();
        
        int idade = anoAtual - anoNascimento;
              
        if(idade > 60){
            System.out.println("Você está muito velho!");
        }else if(idade >= 40 && idade <= 60){
            System.out.println("Você está coroa ficando velho!");
        }else{
            System.out.println("Você é jovem ainda, mas amanhã velho será!");
        }
    }

}
