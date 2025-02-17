package metodos;

import java.util.Scanner;

/**
 *
 * @author eliomar.campos
 */
public class ProgramaImc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual seu peso: ");
        double peso = teclado.nextDouble();
        
        System.out.print("Qual sua altura: ");
        double altura = teclado.nextDouble();
        
        UtilidadesMath util = new UtilidadesMath();
        double imc = util.calcularImc(peso, altura);
        System.out.println("IMC: "+imc);
        
        System.out.println(verificarImc(imc));
    }//fim do main
    
    private static String verificarImc(double imc){
        String frase = "";
        if(imc < 18.5){
            frase = "Você está ABAIXO do peso ideal!";
        }else if(imc > 35){
            frase = "Você está ACIMA do peso ideal!";
        }else if(imc >= 18.5 && imc <= 35){
            frase = "Você está com o peso ideal!";
        }
        return frase;
    }
    
}
