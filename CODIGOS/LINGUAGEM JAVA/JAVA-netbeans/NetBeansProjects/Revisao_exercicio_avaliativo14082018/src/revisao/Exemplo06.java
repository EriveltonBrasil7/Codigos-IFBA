
package revisao;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        int medalhasBrasil, medalhasEua, medalhasItalia;
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite o número de medalhas do Brasil:");
        medalhasBrasil = teclado.nextInt();
        
        System.out.println("Digite o número de medalhas dos EUA:");
        medalhasEua = teclado.nextInt();
        
        System.out.println("Digite o número de medalhas da Itália:");
        medalhasItalia = teclado.nextInt();
        
        if(medalhasBrasil > medalhasEua && medalhasBrasil >medalhasItalia){
            System.out.println("O Brasil tem o maior número de medalhas!");
        }else if(medalhasEua > medalhasBrasil && medalhasEua >medalhasItalia){
            System.out.println("Os EUA tem o maior número de medalhas!");
        }else if (medalhasItalia > medalhasBrasil && medalhasItalia > medalhasEua){
            System.out.println("A Itália tem o maior número de medalhas!");
        }else if(medalhasBrasil==medalhasEua && medalhasBrasil==medalhasItalia && medalhasEua == medalhasItalia){
            System.out.println("Os Paises tem os mesmos números de medalhas!");
        }
    }
}
