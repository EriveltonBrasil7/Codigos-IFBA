package introducao;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {
        Integer anoAtual;
        int anoNascimento;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ano Atual:");
        anoAtual = Integer.parseInt(teclado.nextDouble()+""); 
        System.out.println(anoAtual);
    }

}
