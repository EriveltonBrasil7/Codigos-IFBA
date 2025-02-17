package introducao;

public class Exemplo13 {

    public static void metodo1() {
        System.out.println("Chamou o método 1!");
    }
    
    public static void metodo2(String nome){
        System.out.println("chamou o método 2 "+nome+"!");     
    }
    
    public static void metodo3(int idade){
        System.out.println("chamou o método 3, idade: "+idade);
    }
    
    public static void metodo4(String email, double altura){
        System.out.println("email: "+email);
        System.out.println("altura: "+altura);
    }
    
    public static int metodo5(){
        System.out.println("Chamou o metodo5");
        int idade = 50;
        return idade;
    }
    
    public static double calcularImc(double altura, double peso){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
     
    public static void main(String[] args) {
        System.out.println("Chamou primeiro o man!");
        metodo1();
        metodo2("Eliomar");
        metodo3(35);
        metodo4("egc@ifba.br", 1.8);
        int retornoMetodo5 = metodo5()*5;
        System.out.println("Valor do retorno do metodo5: "+retornoMetodo5);
        System.out.println("Valor do retorno do metodo5: "+metodo5());
               
        System.out.println("Resultado IMC: "+calcularImc(1.75, 85.5));
        
    }       

}
