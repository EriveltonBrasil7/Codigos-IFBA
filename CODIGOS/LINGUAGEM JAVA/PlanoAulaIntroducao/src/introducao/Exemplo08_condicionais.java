package introducao;

import java.util.Scanner;


public class Exemplo08_condicionais {
    public static void main(String[] args) {      
        //FOCO: Condicionais, Operadores lógicos
        //PROBLEMA: Sistema que verifica as condições de voto. 
        int anoNasc, anoAtual, idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano do seu nascimento: ");
        anoNasc = teclado.nextInt();
        
        System.out.print("Digite o ano atual: ");
        anoAtual = teclado.nextInt();
        
        idade = anoNasc - anoAtual;
        
        if(idade >= 18 && idade <= 70){
            System.out.println("O seu voto é obrigatório!");
        }else if(idade >= 16 || idade > 70){     
            System.out.println("O seu voto é facultativo!");
        }else if(idade < 16){
            System.out.println("Você não pode votar!");
        }
        
        
        
    }
}
