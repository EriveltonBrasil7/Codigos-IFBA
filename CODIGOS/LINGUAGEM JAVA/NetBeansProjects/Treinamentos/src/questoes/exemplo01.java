
package questoes;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        float a,b,c,soma;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        a = teclado.nextFloat();
        
        System.out.println("Digite o valor de B:");
        b = teclado.nextFloat();
        
        System.out.println("Digite o valor de C:");
        c = teclado.nextFloat();
        
        soma = a+b;
        
        if(soma<c){
            System.out.println("A soma de A+B é menor que C!");
        }else if(soma>c){
        System.out.println("A soma de A+B é maior que C!");
    }
    }
}
