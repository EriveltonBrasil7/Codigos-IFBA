package metodos;

import java.util.Scanner;


public class ProgramaDistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite X1: ");
        double x1 = teclado.nextDouble();
        
        System.out.print("Digite X2: ");
        double x2 = teclado.nextDouble();
        
        System.out.print("Digite Y1: ");
        double y1 = teclado.nextDouble();
        
        System.out.print("Digite Y2: ");
        double y2 = teclado.nextDouble();
        
        
        System.out.println("Distância entre os pontos: "+UtilidadesMath.calcularDistanciaPontos(x1, x2, y1, y2));
        
    }
}
