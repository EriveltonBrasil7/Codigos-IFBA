package introducao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int a,b,soma;
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite um valor: ");
        a = teclado.nextInt();
        System.out.println("Digite outro valor: ");
        b = teclado.nextInt();
        soma = a+b;
        
        System.out.println("Resultado: "+soma);
        
    }
}
