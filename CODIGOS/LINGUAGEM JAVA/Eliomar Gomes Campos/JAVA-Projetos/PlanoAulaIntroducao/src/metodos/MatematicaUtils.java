/*
 Essa classe vai ser instanciada pela classe Exemplo3_1, com o objetivo de aprender acessar um método que está em outra classe
 */
package metodos;

public class MatematicaUtils { //na aula posso chamar essa clase de MatematicaUtilidades

    public double calcularAreaRetangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public double calcularImc(double peso, double altura) {
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
