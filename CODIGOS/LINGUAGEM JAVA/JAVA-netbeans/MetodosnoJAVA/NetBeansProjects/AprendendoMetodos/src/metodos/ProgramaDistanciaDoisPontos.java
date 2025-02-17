
package metodos;

import java.util.Scanner;

public class ProgramaDistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite x1:");
        double x1 = teclado.nextDouble();
        
        System.out.println("Digite x2:");
        double x2 = teclado.nextDouble();
        
        System.out.println("Digite y1:");
        double y1 = teclado.nextDouble();
        
        System.out.println("Digite y2:");
        double y2 = teclado.nextDouble();
        
        
        
        System.out.println("A distancia entre os pontos: "+UtilidadesMath.CalcularDistanciasPontos(x1, x2, y1, y2));
    }
}
