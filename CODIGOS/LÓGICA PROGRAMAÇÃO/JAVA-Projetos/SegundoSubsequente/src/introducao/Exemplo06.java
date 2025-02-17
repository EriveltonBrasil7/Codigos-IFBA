package introducao;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
       int anoNasc, anoAtual, idade;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o ano do seu nascimento: ");
       anoNasc = teclado.nextInt();
       
       System.out.println("Digite o ano atual: ");
       anoAtual = teclado.nextInt();
       
       idade = anoAtual - anoNasc;
       
       System.out.println("Sua idade é: "+idade);
        
       if(idade >=18 && idade <=70){
           System.out.println("Seu voto é obrigatório!");
       }else if(idade >= 16 || idade > 70){
           System.out.println("você pode votar, mas não é obrigado!");
       }else if(idade < 16){
            System.out.println("Você não pode votar!");
       }
        
       
    }
}

 
