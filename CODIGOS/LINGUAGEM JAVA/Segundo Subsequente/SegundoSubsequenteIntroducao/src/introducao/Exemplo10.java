package introducao;

import java.util.Scanner;

public class Exemplo10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para saber a tabuada: ");
        int numero = teclado.nextInt();

        //Resolvendo com While
//        int i = 0;
//        while ( i < 10) {
//            i++;
//            System.out.println(numero + " X " + i + " = " + numero * i);
//        }

        //Resolvendo com DO WHILE
        int i = 0;
        do{
            i++;
            System.out.println(numero + " X " + i + " = " + numero * i);
        }while(i < 10);

    }
}
