package prova1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int lula=0, bolsonaro=0, amoedo=0, voto;
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i < 10; i++){
            System.out.print("Qual o seu voto? ");
            voto = teclado.nextInt();
            switch (voto) {
                case 13:
                    lula++;
                    break;
                case 17:
                    bolsonaro++;
                    break;
                case 30:
                    amoedo++;
                    break;
                default:
                    i--;
                    break;
            }
        }
        
        System.out.println("Total Votos Lula: "+lula);
        System.out.println("Total Votos Bolsonaro: "+bolsonaro);
        System.out.println("Total Votos Amoêdo: "+amoedo);
        
        if(lula > bolsonaro && lula > amoedo){
            System.out.println("Lula é o presidente!");
        }else if(bolsonaro > amoedo && bolsonaro > lula){
            System.out.println("Bolsonaro é o presidente!");
        }else{
            System.out.println("Amoêdo é o presidente!");
        }
        
    }
}
