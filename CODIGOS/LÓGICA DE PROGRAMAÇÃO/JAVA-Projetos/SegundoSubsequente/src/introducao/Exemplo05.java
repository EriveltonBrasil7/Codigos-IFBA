package introducao;

import java.util.Scanner;



public class Exemplo05 {
    public static void main(String[] args) {
        int medalhasBrasil, medalhasItalia, medalhasEua;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a quantidade de medalhas do Brasil?");
        medalhasBrasil = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Qual a quantidade de medalhas da Italia?");
        medalhasItalia = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Qual a quantidade de medalhas dos EUA?");
        medalhasEua = Integer.parseInt(teclado.nextLine());
        
        if((medalhasBrasil > medalhasItalia) && (medalhasBrasil > medalhasEua)){
            System.out.println("O Brasil é o maior medalhista!");
        }else if(medalhasItalia > medalhasBrasil && medalhasItalia > medalhasEua){
            System.out.println("A Itália é a maior medalhista!");
        }else if(medalhasEua > medalhasBrasil && medalhasEua > medalhasItalia){
            System.out.println("O EUA é o maior medalhista!");
        }else{
            System.out.println("Todos possuem o mesmo número de medalhas.");
        } 
        
                                                        
    }   
    
}
