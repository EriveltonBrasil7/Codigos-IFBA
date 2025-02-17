package introducao;

import java.util.Scanner;

public class Exemplo12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para saber a tabuada: ");
        int numero = teclado.nextInt();
        
        //Resolvendo com o While

        /* int i = 0;
        while (i < 10) {
            i++;
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }*/
        
        //Resolvendo com Do While
        
        /*int i = 0;
        do
        {
            i++;
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }
        while (i < 10);
        */
        
        //Resolvendo com o FOR
        for(int i = 1; i<=10; i++){
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }; 

    }
}
