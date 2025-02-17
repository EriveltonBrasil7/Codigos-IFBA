package introducao;

import java.util.Scanner;


public class Exemplo07_condicionais {
    public static void main(String[] args) {
        
        //FOCO: Condicionais, Operadores lógicos
        //PROBLEMA: Sistema que verifica qual país possui o maior número de medalhas
        int medalhasBrasil, medalhasItalia, medalhasEua;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o total de medalhas do Brasil: ");
        medalhasBrasil = teclado.nextInt();
        
        System.out.print("Digite o total de medalhas da Itália: ");
        medalhasItalia = teclado.nextInt();
        
        System.out.print("Digite o total de medalhas dos EUA: ");
        medalhasEua = teclado.nextInt();
        
        
        if(medalhasBrasil > medalhasItalia && medalhasBrasil > medalhasEua){
            System.out.println("Brasil teve o maior número de medalhas nessas olímpiadas!");
        }else if(medalhasItalia > medalhasBrasil && medalhasItalia > medalhasEua){
            System.out.println("Itália teve o maior número de medalhas nessas olímpiadas!");
        }else if(medalhasEua > medalhasBrasil && medalhasEua > medalhasItalia){
            System.out.println("EUA teve o maior número de medalhas nessas olímpiadas!");
        }else if (medalhasEua == medalhasBrasil && medalhasEua > medalhasItalia){
            System.out.println("EUA e Brasil são os campeões com o mesmo número de medalhas!");
        }else if(medalhasEua == medalhasItalia && medalhasEua > medalhasBrasil){
            System.out.println("EUA e Itália são os campeões com o mesmo número de medalhas!");         
        }else if(medalhasBrasil == medalhasItalia && medalhasBrasil > medalhasEua){
            System.out.println("Brasil e Itália são os campeões com o mesmo número de medalhas!");
        }else{
            System.out.println("TODOS possuem o mesmo número de medalhas nessas olímpiadas!");
        }
            
    }
}
