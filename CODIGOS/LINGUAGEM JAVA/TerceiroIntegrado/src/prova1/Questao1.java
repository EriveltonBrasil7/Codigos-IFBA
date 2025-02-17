
package prova1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        System.out.print("Digite um número de 1 a 10: ");
        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        
        System.out.println(numero+" X 1 = "+(numero*1));
        System.out.println(numero+" X 2 = "+(numero*2));
        System.out.println(numero+" X 3 = "+(numero*3));
        System.out.println(numero+" X 4 = "+(numero*4));
        System.out.println(numero+" X 5 = "+(numero*5));
        System.out.println(numero+" X 6 = "+(numero*6));
        System.out.println(numero+" X 7 = "+(numero*7));
        System.out.println(numero+" X 8 = "+(numero*8));
        System.out.println(numero+" X 9 = "+(numero*9));
        System.out.println(numero+" X 10 = "+(numero*10));
    }
}
