
package revisao;

import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
      float salarioMensal,percentual, novoSalario;
      
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("Digite seu Salário Mensal:");
        salarioMensal = teclado.nextFloat();
        
        System.out.println("Digite o Percentual(apenas o numero) do Salário:");
        percentual = teclado.nextFloat();
        
        novoSalario = salarioMensal + (salarioMensal * (percentual/100));
        
        System.out.println("Seu novo salário é R$"+novoSalario);
    }
 
}
