package introducao;

import java.util.Scanner;

public class Exemplo09 {

    public static void main(String[] args) {
        //FOCO: Estruturas de repetição
        String frase;
        int qtd;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase para que eu repita: ");
        frase = teclado.nextLine();

        System.out.println("Quantas vezes?");
        qtd = teclado.nextInt();

        //for(inicializacao; condicao; incremento){}
        for (int i = 1; i <= qtd; i++) {
            System.out.println(i + " - " + frase);
        }

    }
}
