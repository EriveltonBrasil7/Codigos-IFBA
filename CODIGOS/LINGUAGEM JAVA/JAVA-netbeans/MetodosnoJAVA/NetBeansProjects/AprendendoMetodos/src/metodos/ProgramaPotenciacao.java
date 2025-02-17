/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author 201720040009
 */
public class ProgramaPotenciacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Qual o valor da base?");
        int base = teclado.nextInt();
        
        System.out.println("Qual o expoente?");
        int expoente = teclado.nextInt();
        
        
        System.out.println("Resultado: "+UtilidadesMath.calcularExpoente(base, expoente));
       // System.out.println("Resultado é:"+Math.pow(base, expoente));
       
        
              
    }
}
