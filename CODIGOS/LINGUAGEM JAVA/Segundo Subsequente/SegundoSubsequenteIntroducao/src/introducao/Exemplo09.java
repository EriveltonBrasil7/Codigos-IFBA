/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

/**
 *
 * @author eliomar.campos
 */
public class Exemplo09 {
    public static void main(String[] args) {
        //LOOPS
        String frase = "Eu amo Java!";
        int quantidade = 0;
        
        System.out.println("Utilizando While:");
        while(quantidade < 10){
            System.out.println((quantidade+1)+" - "+frase);
            quantidade++;
        }
        
        System.out.println("Utilizando For");
        for(int i = 0; i < 10; i++){
            System.out.println((i+1)+" - "+frase);
        }
        
    }
}
