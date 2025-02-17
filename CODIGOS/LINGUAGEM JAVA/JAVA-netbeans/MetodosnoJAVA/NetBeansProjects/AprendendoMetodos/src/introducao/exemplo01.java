
package introducao;

public class exemplo01 {
     public static void metodo1(){
            System.out.println("Chamou o método 1!");
    }
     public static void metodo2(String nome){
         System.out.println("Chamou o metodo 2 "+nome+"!");
        
     }
     public static void metodo3(int idade){
         System.out.println("Chamou o metodo 3, idade: "+idade);
     }
     public static void metodo4(String email,double altura ){
         System.out.println("e-mail:"+email);
         System.out.println("altura:"+altura);
     }
     public static int metodo5(){
         System.out.println("Chamou o método 5");
         int idade = 50;
         return idade;
     }
     public static double calcularIMC(double altura, double peso){
         double imc  = peso/(altura*altura);
         System.out.println("O resultado do IMC é: ");
         return imc;
     }
     
    public static void main(String[] args) {
        System.out.println("Chamou primeiro o man!");
        metodo1();
        metodo2("Erivelton");
        metodo3(22);
        metodo4("erivelton.brasil07@gmail.com", 1.7);
        int retornoMetodo5 = metodo5();
        System.out.println("Valor do retorno do metodo5: "+retornoMetodo5);
        System.out.println("Valor do retorno do metodo5: "+metodo5());
        System.out.println("O resultado do IMC é: "+calcularIMC(1.7,55));
    }
      
}
