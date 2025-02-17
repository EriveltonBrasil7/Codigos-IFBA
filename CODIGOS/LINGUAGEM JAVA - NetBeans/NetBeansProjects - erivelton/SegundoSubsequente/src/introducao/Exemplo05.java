package introducao;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        //No lugar de double poderia ser também float;
        double nota1, nota2, resultado;
        //declarando a variável do Tipo Scanner
      Scanner teclado = new Scanner(System.in)  ;
        //System.out.print exibe na tela do usuário.
        //nota1 = teclado.nextDouble(): recebe o valor digitado do usuário.
      System.out.print("Digite a Nota 1: ");
      nota1 = teclado.nextDouble();
      
      System.out.print("Digite a Nota 2: ");
      nota2 = teclado.nextDouble();
       
      resultado = (nota1 + nota2)/2;
      //condicional IF e ELSE.
      if(resultado < 6){
          System.out.println("Reprovado");
      
    }else if(resultado >= 6){
          System.out.println("Aprovado");
          if(resultado == 10)
          System.out.println("Parabéns!!");
     } 
     
          
}
}

