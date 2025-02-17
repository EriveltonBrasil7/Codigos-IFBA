package metodos;

import java.util.Scanner;

/**
 *
 * @author eliomar.campos
 */
public class ProgramaAcumularValores {
    public static void main(String[] args) {
        System.out.print("Qual o limite da soma: ");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        
        System.out.print("Qual o inicio da soma: ");
        int inicio = teclado.nextInt();
        
        UtilidadesMath util = new UtilidadesMath();
        int valorAcumulado = util.acumularValores(inicio, limite);
        System.out.println("TOTAL: "+valorAcumulado);
  
    }
}
