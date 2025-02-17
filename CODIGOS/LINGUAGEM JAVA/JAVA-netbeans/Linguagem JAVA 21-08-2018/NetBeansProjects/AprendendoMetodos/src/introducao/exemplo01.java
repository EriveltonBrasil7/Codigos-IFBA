
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
     
    public static void main(String[] args) {
        System.out.println("Chamou primeiro o man!");
        metodo1();
        metodo2("Erivelton");
        metodo3(35);
        metodo4("erivelton.brasil07", 17);
    }
      
}
