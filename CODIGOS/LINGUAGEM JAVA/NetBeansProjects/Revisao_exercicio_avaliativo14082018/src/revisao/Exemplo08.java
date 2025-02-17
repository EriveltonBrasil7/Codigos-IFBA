
package revisao;

import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        int numero,i;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um númeor de 1 a 10:");
        numero = teclado.nextInt();
        
        for(i=0;i<=10;i++){
            System.out.println(numero+" X "+i+" = "+(i*numero));
        }
    }
  
}
