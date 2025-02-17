/*
 * Estruturas Condicionais de Múltipla situações
 * É uma forma de reduzir a complexidade de vários if … else encadeados.
 * É muito utilizado, principalmente para uso em estruturas de menu.
 * O conteúdo de uma variável é comparado com um valor constante, e caso a comparação seja verdadeira, um determinado comando é executado.
 * Não são aceitas expressões condicionais no comando switch…case, somente são aceitos valores constantes.
 * Esta é um diferença bem grande quando comparado ao comando if…else.
 * Portanto caso tenha que testar uma condição você terá que usar if…else ao invés do switch…case.
 */
package introducao;

import java.util.Scanner;

/**
 *
 * @author Eliomar
 */
public class Exemplo09_condicionais {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número correspondente ao dia da semana (1 a 7): ");
        int dia = teclado.nextInt();
       
        
        switch(dia){
            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor Inválido"); 
        }
        
    }
    
}
