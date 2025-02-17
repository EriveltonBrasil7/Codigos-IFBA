package introducao;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome Completo: ");
        String nome = teclado.nextLine();
        
        System.out.print("Ano Nascimento: ");
        anoNascimento = teclado.nextInt();
        
        teclado.next();
        
        System.out.print("Frase: ");
        String frase = teclado.nextLine();
        
        
        
        System.out.print("Ano Atual: ");
        anoAtual = teclado.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        if(idade >= 60){
            System.out.println("Você está velho!");
        }else if(idade < 60){
            System.out.println("Você está jovem!");
        }
    }
}
