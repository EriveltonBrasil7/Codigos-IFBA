/*
 * Vetores ou variável composta
 */
package introducao;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eliomar
 */
public class Exemplo15_arrays {
    public static void main(String[] args) {
        
        //Declarando e inserindo num vetor
        //Exemplo armazenar a temperatura média de cada dia      
        ArrayList<Double> temperaturas = new ArrayList<>();
        temperaturas.add(1.0);
        temperaturas.add(5.0);
        temperaturas.add(10.11);
        temperaturas.add(41.3);
        temperaturas.add(50.0);
        
        //Exibindo valor de uma posição do Array
        System.out.println("A temperatura do dia 3 é: "+temperaturas.get(2));
        
        //Exibindo o tamanho do array
        System.out.println("O tamanho do Array é: "+temperaturas.size());
        
       
        //vamos listar o conteúdo utilizando o WHILE
        int d=0;
        while(d<temperaturas.size()){
            System.out.println(temperaturas.get(d));
            d++;
        }
        
        //vamos listar o conteúdo do vetor utilizando o FOR
        for(int c=0; c < temperaturas.size(); c++){
            System.out.println(temperaturas.get(c));
        }
        
        //Vamos listar o conteúdo do vetor utilizando o FOR EACH
        for(double temp : temperaturas){
            System.out.println(temp);
        }
        
        
        //Outro exemplo de vetores com String
        ArrayList<String> meses =  new ArrayList<>(15);
        String[] valoresMeses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        //jogando todos os valores da lista de uma única vez
        meses.addAll(Arrays.asList(valoresMeses));
        
        for(String m : meses){
            System.out.println(m);
        }

               
    }
    
}
