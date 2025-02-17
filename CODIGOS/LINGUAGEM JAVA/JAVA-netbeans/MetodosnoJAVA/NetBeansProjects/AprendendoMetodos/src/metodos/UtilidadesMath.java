package metodos;

public class UtilidadesMath {

    //variaveis de classe, chamamos de atributo
    int idade = 23;

    public static void testar() {
        System.out.println("Chamou o método testar");
    }

    public void testar2() {
        System.out.println("Chamou o método testar2");
    }

    /**
     * Este método calcular o IMC (índice de massa corporal)
     *
     * @param peso é o peso em kg
     * @param altura é a altura em metros
     * @return somente o resultado do IMC
     */
    public double calcImc(double peso, double altura) {
        double imc = peso / (altura * altura);

        return imc;
    }

    /**
     * Método que faz o somatório dos valores até o limite informado
     *
     * @param inicio valor do inicio
     * @param limite valor do limite
     * @return o resultado do somatório
     */
    public int acumularValores(int inicio, int limite) {
        int soma = 0;

        for (int i = inicio; i <= limite; i++) {
            soma +=  i;

        }
        return soma;
    }
    
    public  float matriz(float vetor01, float vetor02){
        float numA [] [] = {{2,3,3,4},{9,6,4,7}};
        float numB [] [] = new float [2] [2];
        float somatorio=0;
        int i = 0, c= 0;
        for( i=0;i<numA.length;i++){
            for( c=0;c <numB.length;c++){
                somatorio = i + numA[i][c];
                numB [i][c] = i+c;
                
            }
        }return numB[i][c];
    
    }
    
    public static double calcularExpoente(int base, int expoente){
        double resultado = 1;
        for(int i =1;i <= expoente; i++){
            resultado = resultado * base;
        }
        return resultado;
    }
    public static double CalcularDistanciasPontos(double x1, double x2, double y1, double y2){
       // double distancia = (x2-x1)+(y2-y1);
       double interno = (Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2));
       double distancia = Math.sqrt(interno);
        return distancia;
    
    }
}
