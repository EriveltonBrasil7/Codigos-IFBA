package prova1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double altura, peso, imc;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua altura (m): ");
        altura = teclado.nextDouble();
        
        System.out.print("Digite seu peso (kg): ");
        peso = teclado.nextDouble();
        
        imc = peso/(altura*altura);
        
        if(imc < 18.5){
            System.out.println("Você está ABAIXO do peso ideal!");
        }else if(imc > 35){
            System.out.println("Você está ACIMA do peso ideal!");
        }else if(imc >= 18.5 && imc <= 35){
            System.out.println("Você está com o peso ideal!");
        }
    }
}
