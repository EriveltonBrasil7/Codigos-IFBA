package introducao;

public class Exemplo9 {

    public static void main(String[] args) {
        //LOOPS
        String frase = "Eu amo Karoline ♥!";
        int quantidade = 0;
        //Utilizando While
        while (quantidade < 10) {
            System.out.println(quantidade + " - " + frase);
            quantidade++;
        }
        //Utilizando o for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + frase);

        }

    }
}
