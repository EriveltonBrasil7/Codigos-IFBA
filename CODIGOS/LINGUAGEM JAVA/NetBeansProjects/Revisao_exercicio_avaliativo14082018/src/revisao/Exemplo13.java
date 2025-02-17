
package revisao;

import java.util.Scanner;

public class Exemplo13 {
    public static void main(String[] args) {
       int numero;
       String frase;
       
       Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite uma frase:");
       frase = teclado.nextLine();
       
        System.out.println("Digite quantas vezes você quer repetir a frase anterior:");
        numero = teclado.nextInt();
        
        for(int i = 1; i<=numero;i++){
            System.out.println(frase);
            
        }
    }
  
}
