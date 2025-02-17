package introducao;

import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        int anoAtual;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um ano:");
        anoAtual = teclado.nextInt();
       
        
        for (int i = 0; i < 50; i++) {
            System.out.println(anoAtual);
            anoAtual = anoAtual + 4;
            
        }
    }
}
