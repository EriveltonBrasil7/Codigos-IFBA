
package revisao;

import java.util.Scanner;

public class Exemplo16 {
    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite um numero qualquer:");
        numero = teclado.nextInt();
        
        for(int i =1; i <=numero; ){
            System.out.println(i+" + "+i);
            i = i+i;
        }
    }
}
