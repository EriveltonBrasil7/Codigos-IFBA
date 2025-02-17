/*
    - Para mostrar que podemos precisar desses tipos de métodos em outras classes, e aí vai haver repetição de métodos
    - Portanto, no próximo exemplo4 mostrarei como reutilizar declaração de métodos de uma outra classe
*/
package metodos;

public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("Calcular Potenciação: "+calcularPotenciacao(10, 8)); 
        System.out.println("Calcular Área retangulo: "+calcularAreaRetangulo(10, 20));
        System.out.println("Calcular IMC: "+calcularImc(83.5, 1.7));       
    }
    
    public static double calcularAreaRetangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static float calcularPotenciacao(float numero, int potencia) {
        float resultado = numero;

        for (int contador = 1; contador < potencia; contador++) {
            resultado *= numero;
        }
        
        return resultado;
    }
}
