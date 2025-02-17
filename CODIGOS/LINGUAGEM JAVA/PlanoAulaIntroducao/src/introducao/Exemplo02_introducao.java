/* 
ESCOPO
1 - Aprender a sintaxe de variáveis, inserção de valores;
2 - Saída de valores pelo terminal, concatenação;
3 - Inserção de valores pelo terminal (classe Scanner);
4 - Importando classes de bibliotecas (import);
5 - if else;
6 - Tipo String;
 */
package introducao;

import java.util.Scanner;

public class Exemplo02_introducao {

    public static void main(String[] args) {
        
        //FOCO: Variáveis, Classe Scanner (método de entrada)
        //PROBLEMA: SISTEMA QUE CALCULA A MÉDIA DE DUAS NOTAS
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

        System.out.println("Sua média é "+ media + " " + nomeAluno);

    }

}
