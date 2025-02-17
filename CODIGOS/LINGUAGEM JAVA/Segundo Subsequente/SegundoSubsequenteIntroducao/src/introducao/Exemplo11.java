package introducao;

import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para saber a tabuada: ");
        int numero = teclado.nextInt();
        
        //FOR (inicialização; condição; incremento)
        
        for(int i=0; i < 10; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
