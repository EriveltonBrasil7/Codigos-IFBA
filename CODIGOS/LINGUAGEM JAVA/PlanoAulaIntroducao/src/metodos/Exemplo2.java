/*
    - Faz esse programa sem métodos, depois vai mostrando a importância do método
    - Claro que desconsiderando o uso de loops
*/
package metodos;

import java.util.Scanner;

public class Exemplo2 {

    public static int votosLula = 0, votosBolsonaro = 0, votosMaia = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Eleitor 1 - Digite para votar: 13-Lula, 11-Bolsonaro, 45-Maia: ");
        int voto = teclado.nextInt();
        depositarVoto(voto);

        System.out.print("Eleitor 2 - Digite para votar: 13-Lula, 11-Bolsonaro, 45-Maia: ");
        voto = teclado.nextInt();
        depositarVoto(voto);

        System.out.print("Eleitor 3 - Digite para votar: 13-Lula, 11-Bolsonaro, 45-Maia: ");
        voto = teclado.nextInt();
        depositarVoto(voto);

        System.out.print("Eleitor 4 - Digite para votar: 13-Lula, 11-Bolsonaro, 45-Maia: ");
        voto = teclado.nextInt();
        depositarVoto(voto);

        System.out.print("Eleitor 5 - Digite para votar: 13-Lula, 11-Bolsonaro, 45-Maia: ");
        voto = teclado.nextInt();
        depositarVoto(voto);

        verificarPresidente();

    }
    
    public static void depositarVoto(int votoDigitado) {
        switch (votoDigitado) {
            case 13:
                votosLula++;
                break;
            case 11:
                votosBolsonaro++;
                break;
            case 45:
                votosMaia++;
                break;
            default:
                break;
        }
    }
    
    public static void verificarPresidente() {
        
        mostrarResultados();
        
        if (votosLula > votosBolsonaro && votosLula > votosMaia) {
            System.out.println("Lula é o novo presidente!");
        } else if (votosBolsonaro > votosLula && votosBolsonaro > votosMaia) {
            System.out.println("Bolsonaro é o novo presidente!");
        } else if (votosMaia > votosLula && votosMaia > votosBolsonaro) {
            System.out.println("Rodrigo Maia é o novo presidente!");
        } else if (votosMaia == votosLula && votosMaia == votosBolsonaro) {
            System.out.println("Todos os candidatos empataram, haverá segundo turno!");
        } else if (votosMaia == votosLula && votosMaia > votosBolsonaro) {
            System.out.println("Rodrigo Maia e Lula empataram, e disputarão o segundo turno!");
        } else if (votosMaia == votosBolsonaro && votosMaia > votosLula) {
            System.out.println("Rodrigo Maia e Bolsonaro empataram, e disputarão o segundo turno!");
        } else if (votosBolsonaro == votosLula && votosBolsonaro > votosMaia) {
            System.out.println("Bolsonaro e Lula empataram, e disputarão o segundo turno!");
        }
    }
    
    public static void mostrarResultados() {
        System.out.println("Apuração dos resultados:");
        System.out.println("Total de votos Lula:" + votosLula);
        System.out.println("Total de votos Bolsonaro:" + votosBolsonaro);
        System.out.println("Total de votos Rodrigo Maia:" + votosMaia);
    }
}
