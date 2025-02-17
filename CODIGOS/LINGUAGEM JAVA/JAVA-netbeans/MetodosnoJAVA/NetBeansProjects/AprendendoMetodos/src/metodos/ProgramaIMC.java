
package metodos;

import java.util.Scanner;


public class ProgramaIMC {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o seu peso em Kg:");
        double valorpeso = teclado.nextDouble();
        
         System.out.print("Digite a sua altura(m):");
        double valoraltura = teclado.nextDouble();
        
        UtilidadesMath resultado = new UtilidadesMath();
        double imc = resultado.calcImc(valorpeso, valoraltura);
        System.out.println(" IMC: "+imc);
        
        System.out.println(verificarImc(imc));
        
        
    }//fim do main 
    
    private static String verificarImc(double imc){
        String frase = " ";
        
        if(imc >35){
            frase = " Você está ACIMA do peso ideal.";
        } else if(imc>=18.5 && imc <=35){
            frase = " Você está no peso ideal.";
        
        }else if(imc<18.5){
            frase = "Você está ABAIXO do peso.";
    }else{
            frase = "Você está obeso.";
            
        }return frase;
    }
    
    
}
