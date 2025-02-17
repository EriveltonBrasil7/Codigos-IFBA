package introducao;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);  
        System.out.print("Digite um número de 1 a 10 para exibir a tabuada: ");
        int numero = teclado.nextInt();
        
        int i = 1;
//        while(i <= 10){ 
//            System.out.println(numero+" X "+i+" = "+i *numero);
//            i++;
//        }
        
        //COM FOR customizado
        int p=5;
        for(; p <= 10; ){
            System.out.println(numero+" X "+p+" = "+p *numero);
            p++;
        }
        
    }
}
