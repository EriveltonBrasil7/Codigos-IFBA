package introducao;

public class Exemplo01_introducao {
    public static void main(String[] args) {
        //FOCO: Variáveis: Declaração, Tipos primitivos, Atribuição de valores, Operadores aritméticos, método de saída
        //SISTEMA QUE CALCULA A MÉDIA DE DUAS NOTAS
        float nota1;
        float nota2;
        int quantidadeDeNotas;
        String nome;
        
        nota1 = (float) 10;
        nota2 = 10;  
        quantidadeDeNotas = (int) 2.5; //convertendo double para int
        float media = (nota1 + nota2)/quantidadeDeNotas;
        
        nome = "Eliomar Campos";
        
        System.out.println("Olá "+nome+", sua média é: "+media);
        
    }
}
