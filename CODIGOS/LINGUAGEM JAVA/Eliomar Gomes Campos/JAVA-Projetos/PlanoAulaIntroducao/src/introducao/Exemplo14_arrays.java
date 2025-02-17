/*
 * Vetores ou variável composta
 */
package introducao;

import java.util.Arrays;

/**
 *
 * @author Eliomar
 */
public class Exemplo14_arrays {
    public static void main(String[] args) {
        
        //###########################################################
        //Declarando, inserindo e listando num vetor/array de doubles
        //###########################################################
        
        //Exemplo armazenar a temperatura média de cada dia do ano     
        double[] temperaturas = {1.4, 4, 5.1, 9.3, 9};
//      double[] temperaturas = new double[10];
//      temp[0] = 1;
        
        //Exibindo valor de uma posição do Array
        System.out.println("A temperatura do dia 3 é: "+temperaturas[2]);
        
        //Exibindo o tamanho do array
        System.out.println("O tamanho do Array é: "+temperaturas.length);
          
        //vamos listar o conteúdo utilizando o WHILE
        int d=0;
        while(d<temperaturas.length){
            System.out.println(temperaturas[d]);
            d++;
        }
        
        //vamos listar o conteúdo do vetor utilizando o FOR
        for(int c=0; c < temperaturas.length; c++){
            System.out.println(temperaturas[c]);
        }
        
        //Vamos listar o conteúdo do vetor utilizando o FOR EACH
        for(double temp : temperaturas){
            System.out.println(temp);
        }
        
        
        
        
        //###########################################################
        //Outro exemplo de vetores com String
        //###########################################################
        String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set",
            "Out","Nov","Dez"};
        int[] totalDias  = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int c=0; c < meses.length; c++){
            System.out.println("O mês de "+meses[c]+" tem "+totalDias[c]+" dias ao todo");
        }
        
        //Alguns Métodos com vetores
        System.out.println("Qual a posição de tal elemento? "+Arrays.binarySearch(temperaturas, 9));
        
        
        
        //###########################################################
        //Outro exemplo de vetores com Object
        //###########################################################
        
        //O vetor do tipo Object permite armazenar diversos tipos 
        Object[] vetorObject = new Object[]{1, "Eliomar", 2.5, "João", "Pedro"};
        
        for(int i=0; i < vetorObject.length; i++){
            System.out.println("Posição "+(i+1)+": "+vetorObject[i]);
        }
        
        //Outra forma
        Object[] vetor = new Object[10];
        vetor[0] = 1;
        vetor[1] = "Eliomar";
        vetor[2] = 2.5;
        vetor[3] = "João";
        vetor[4] = "Pedro";
        
        for(int i=0; i < vetor.length; i++){
            System.out.println("Posição "+(i+1)+": "+vetor[i]);
        }
         
        
        
    }
    
   
    
}
