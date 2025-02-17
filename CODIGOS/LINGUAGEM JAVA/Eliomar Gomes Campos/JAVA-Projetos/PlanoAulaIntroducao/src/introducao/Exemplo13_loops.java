package introducao;

import java.util.Scanner;


public class Exemplo13_loops {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite até que valor deseja acumular: ");
        int valor = teclado.nextInt();
        
        int soma = 0;
        
        for(int i=1; i <= valor; i++){
            soma = soma + i;           
        }      
        
        System.out.println("Somatório: "+soma);
    }
}
