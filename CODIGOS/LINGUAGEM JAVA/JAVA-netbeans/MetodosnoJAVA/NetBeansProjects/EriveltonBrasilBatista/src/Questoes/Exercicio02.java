
package Questoes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String nomeUsuario;
        float peso, altura, imc;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o seu nome:");
        nomeUsuario = teclado.nextLine();
        
        System.out.print("Digite o seu peso(KG):");
        peso= teclado.nextFloat();
        
        System.out.print("Digite a sua altura(m):");
        altura = teclado.nextFloat();
        
        imc = peso/(altura*altura);
        
        if(imc < 18.5){
            System.out.println("Olá "+nomeUsuario+"! Seu IMC é "+imc+" você está ABAIXO do peso ideal.");
        }else if(imc > 35){
            System.out.println("Olá "+nomeUsuario+"! Seu IMC é "+imc+" você está ACIMA do peso ideal.");
        }else if(imc >= 18.5 && imc <=35 ){
            System.out.println("Olá "+nomeUsuario+"! Seu IMC é "+imc+" você está com o peso ideal.");
        }
    }
}
