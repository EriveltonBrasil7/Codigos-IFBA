package introducao;

public class Exemplo02 {
    public static void main(String[] args) {
      //Convertendo de inteiro para String
      int idade = 30;
      String valor;
      //valor = idade; //ERRADO!
      //valor = (String) idade; //ERRADO!
      valor = Integer.toString(idade);
      System.out.println("Valor de inteiro para String: "+valor);
       
       //Convertendo de String para Inteiro
      int idade2;
      String valor2 = "30";
      //idade2 = valor2; //ERROR!
      //idade2 = (int) valor2; //ERROR!
      idade2 = Integer.parseInt(valor2);
      
      
      
      
      //Convertendo de Float para String
      float idade3 = 30;
      String valor3;
      valor3 = Float.toString(idade3);
      
      //Convetendo de String para Float
      float idade4;
      String valor4 = "30";
      idade4 = Float.parseFloat(valor4);
      
      
      
      
      
      //Convertendo de Double para String
      double idade5 = 30;
      String valor5;
      valor5 = Double.toString(idade5);
      
      //Convertendo de String para Double
      double idade6;
      String valor6 = "30";
      idade6 = Double.parseDouble(valor6);
      
      
      //Tipo boolean
      boolean status = false; //valores true ou false
      System.out.println("Valor do Status: "+status);
      String nome = Boolean.toString(status);
            
      
    }
}
