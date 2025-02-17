
package metodos;

import java.util.Scanner;

public class ProgramaAcumularValores {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
         System.out.print("Qual o inicio da soma: ");
        int inicio = teclado.nextInt();
        
        System.out.print("Digite o limite da soma: ");
        int limite = teclado.nextInt();
        
       
        
         UtilidadesMath resultado = new UtilidadesMath();
         
        System.out.println("O resultado da Acumulação é: "+resultado.acumularValores(inicio, limite));
       
        
        
    }
}
