package introducao;

public class Exemplo6 {
    public static void main(String[] args) {
        //Declarando Vetores
        //double temperaturas[] = new double[365];
        
        //Inserindo Valores em um vetor
//        temperaturas[0] = 5.5;
//        temperaturas[1] = 17;
//        temperaturas[2] = 30;
        
        double temperaturas[] = {5.5, 17, 30};
        
        //Exibindo Valores de um vetor
        System.out.println("A temperatura do dia 3: "+temperaturas[2]);
        System.out.println("Tamanho do Array: "+temperaturas.length);
        
        //Listando o conteúdo do array
        for(int i=0; i < temperaturas.length; i++){
            System.out.println("A temperatura do dia "+ (i+1) +": "+temperaturas[i]);
        }
        
        //Maneira mais prática de listar Arrays
        int i=0;
        for(double valor : temperaturas){
            i++;
            System.out.println("A temperatura do dia "+ i +": "+valor);
        }
        
        //Criando Vetor do tipo String
        String meses[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set"};
        System.out.println("Terceiro mês do ano é: "+meses[2]);
    }
}
