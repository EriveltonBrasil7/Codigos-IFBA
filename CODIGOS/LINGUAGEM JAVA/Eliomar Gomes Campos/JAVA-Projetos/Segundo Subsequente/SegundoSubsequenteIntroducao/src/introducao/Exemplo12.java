package introducao;

import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = teclado.nextInt();  
        
        for(int i=0; i < 50; i++){
            ano = ano + 4;
            System.out.println(ano);
        }
    }
    
    
}
