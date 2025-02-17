package introducao;

import java.util.Scanner;

public class Exemplo05_condicionais {

    public static void main(String[] args) {
        
        //FOCO: Condicionais e Operadores relacionais
        //PROBLEMA: Sistema que calcula a média de duas notas e verifica o status do aluno. 
        //float a, b;
        Float a, b, media;
        String nomeAluno;
        
        //Criar um objeto para receber entrada do teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu Nome: ");
        nomeAluno = teclado.nextLine();
        System.out.print("Digite a primeira nota: ");
        a = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        b = teclado.nextFloat();
        
        media = (a + b) / 2;
        
        if(media >= 6){
            
            if(media != 10){
                System.out.println("Você foi aprovado "+nomeAluno);
                System.out.println("Sua média é "+ media);               
            }else if(media == 10){
                System.out.println("Parabéns "+nomeAluno+", pela média 10 !!!!");
            }
            
        }else if(media < 6){
            
            System.out.println("Você foi reprovado "+nomeAluno);
            System.out.println("Sua média é "+ media);
            if(media < 3){
                System.out.println("Infelizmente, você não tem direito a fazer a prova final");
            }else{
                System.out.println("Então vejo você na prova final!");
            }
            
        }

        

    }

}
