
package revisao;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        String nomeDisciplina;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o nome da disciplina:");
        nomeDisciplina = teclado.nextLine();
        
        System.out.println("Digite sua primeira nota:");
        nota1 = teclado.nextFloat();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = teclado.nextFloat();
        
        System.out.println("Digite sua terceira nota:");
        nota3 = teclado.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("Sua média na disciplina "+nomeDisciplina+" é "+media+".");
    }
 
}
