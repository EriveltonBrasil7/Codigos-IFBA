package introducao;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite a nota 2: ");
        double nota2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite O seu nome: ");
        String nomeAluno = teclado.nextLine();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            if (media == 10) {
                System.out.println("Parabéns " + nomeAluno + ", pela média 10!");
            } else {
                System.out.println("Você foi aprovado " + nomeAluno + ", sua média é: " + media);
            }
        } else{
            if(media < 3){
                System.out.println("Você foi reprovado sem direito a final" + nomeAluno + ", sua média é: " + media);
            }else if(media >= 3){
                System.out.println("Você foi reprovado com direito a final" + nomeAluno + ", sua média é: " + media);
            }
            
        }

    }

}
