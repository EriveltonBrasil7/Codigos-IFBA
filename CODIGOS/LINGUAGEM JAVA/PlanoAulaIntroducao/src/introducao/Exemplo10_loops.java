package introducao;

import java.util.Scanner;

public class Exemplo10_loops {
    public static void main(String[] args) {
        //FOCO: Estruturas de repetição
        String frase;
        int qtd;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma frase para que eu repita: ");
        frase = teclado.nextLine();
        
        System.out.println("Quantas vezes?");
        qtd = teclado.nextInt();
        
        int i = 0; //inicialização
        while(i < qtd){ //condição
           System.out.println(i+" - "+frase); 
           i++; //incremento
        }
        
    }
}
