package prova1;

import java.util.Scanner;


public class Questao5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = teclado.nextInt();
        int somatorio = 0;
        
        for(int i=1; i <= numero; i++){
            somatorio = somatorio + i;
            System.out.println(i+1);
        }
        
        System.out.println("Resultado: "+somatorio);
        
    }
}
