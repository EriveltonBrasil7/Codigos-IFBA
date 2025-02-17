package metodos;

import java.util.Scanner;


public class ProgramaPontenciacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o base? ");
        int base = teclado.nextInt();
        
        System.out.print("Qual o expoente? ");
        int expoente = teclado.nextInt();
        
        System.out.println("Resultado "+Math.pow(base, expoente));
        //System.out.println("Resultado "+UtilidadesMath.calcularPotenciacao(base, expoente));
    }
}
