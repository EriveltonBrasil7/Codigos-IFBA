package revisao;

import java.util.Scanner;

public class Exemplo11 {

    public static void main(String[] args) {
        float peso, altura, imc;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu peso em KG:");
        peso = teclado.nextFloat();

        System.out.println("Digite a sua altura:");
        altura = teclado.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Seu IMC é "+imc+", Você está ABAIXO do peso ideal.");
        } else if (imc > 35) {
            System.out.println("Seu IMC é "+imc+", Você está ACIMA do peso ideal.");
        } else if (imc >= 18.5 || imc == 35) {
            System.out.println("Seu IMC é "+imc+", Você está com o peso IDEAL.");
        }

    }
}
