package revisao;

import java.util.Scanner;

public class Exemplo10 {

    public static void main(String[] args) {
        int voto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Para votar em Lula digite '13' e para votar em Bolsonaro digite '11'.");
        voto = teclado.nextInt();

        if (voto == 13) {
            System.out.println("Seu voto foi 13, você votou em Lula.");
        } else if(voto == 11){
            System.out.println("Seu voto foi 11, você votou em Bolsonaro.");
        }
    
        
        {

        }
    }
}
