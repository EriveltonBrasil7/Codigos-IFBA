package revisao;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        int numero, numeroAntecessor, numeroSucessor;
        String nome;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá! Eu sou a Siri, me informe qualquer número que eu informarei o sucessor e o antecessor dele:");
        numero = teclado.nextInt();
        
        numeroAntecessor = numero - 1;
        numeroSucessor = numero +1;
        System.out.println("O número digitado é "+numero+" e o seu antecessor é "+numeroAntecessor+" e o seu sucessor é "+numeroSucessor+".");
    }
}
