/*
    - Objetivo: Aprender os conceitos de encapsulamento dos métodos (public, private, e sem nada)
    - Aprender mais sobre métodos estáticos (static), onde não precisamos instanciar um objeto para usar o método
*/

package metodos;

public class Exemplo4 { 
    public static void main(String[] args) {
        System.out.println("Calcular Potenciação: "+MatematicaUtils.calcularPotenciacao(10, 8)); //método sem invocado sem instanciar um objeto, pois esse método é estático  
        
        MatematicaUtils objOpera = new MatematicaUtils(); //Precisamos instanciar um objeto para utilizar o método da classe, pois o método somar não é estático
        System.out.println("Calcular Área retangulo: "+objOpera.calcularAreaRetangulo(10, 20)); //Nós só conseguimos invocar esse método que está em outra classe, porque ele é público
        System.out.println("Calcular IMC: "+objOpera.calcularImc(83.5, 1.7));
        
    }
}
