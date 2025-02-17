package introducao;

import java.util.Scanner;

public class Exemplo01 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite a nota 1: ");
       float nota1 = Float.parseFloat(teclado.nextLine());
       
       System.out.println("Digite a nota 2: ");
       double nota2 = Double.parseDouble(teclado.nextLine());
       
       System.out.println("Digite O seu nome: ");
       String nomeAluno = teclado.nextLine();     
       
       double media = (nota1+nota2)/2; 
       
       System.out.println(nomeAluno+", sua média é: "+media);
  
    }
  
}
