package metodos;

public class UtilidadesMath {
    //variáveis de classe, chamamos de atributo
    int idade = 30; 
    
    public static void testar(){
         System.out.println("Chamou o método testar");
    }   
     
    public void testar2(){
         System.out.println("Chamou o método testar2");
    }
    
    /**
     * Método que faz o somatório dos valores até o limite informado
     * @param inicio valor do início da soma
     * @param limite valor do limite da soma
     * @return o valor acumulado do intervá-lo informado
     */
    public int acumularValores(int inicio, int limite){
        int soma = 0;
        for(int i = inicio; i <= limite; i++){
            soma = soma + i;
            //System.out.println(soma);
        }
        
        return soma;
    }
    
    /**
     * Este método calcula o IMC (índice de massa corporal)
     * @param peso peso é o peso em kg
     * @param altura altura é a altura em metros
     * @return somente o resultado do IMC
     */
    public double calcularImc(double peso, double altura){
        double imc = peso/(altura*altura);
        return imc;
    }
    
    
    public static double calcularPotenciacao(int base, int expoente){
       double resultado = 1;
       for(int i=1; i <= expoente; i++){
           resultado = resultado*base;
       }
       
       if(expoente == 0){
          resultado = 1; 
       }
       
       return resultado;
    }
    
    public static double calcularDistanciaPontos(double x1, double x2, double y1, double y2){
//      double distancia = (x2-x1)+(y2-y1);
        //double interno = (Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)); 
        //double distancia = Math.sqrt(interno);
        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return distancia;
    }
    
}
