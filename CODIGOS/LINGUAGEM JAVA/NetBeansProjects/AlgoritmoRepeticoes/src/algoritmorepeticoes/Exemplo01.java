package algoritmorepeticoes;

public class Exemplo01 {

    public static void main(String[] args) {
        int i=1, soma=0;

        for (i = 1; i <= 20; i++) {

            if (i % 2 != 0 && i % 3 == 0) {
                soma = soma + i;
                
            }
        }
         System.out.println("A soma dos números ímpares e múltiplos de três é "+soma);

    }
}
