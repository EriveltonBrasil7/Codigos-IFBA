
package introducao;

public class Exemplo03_conversoes {
    public static void main(String[] args) {
        //FOCO: CLASSES WRAPPER
        //PROBLEMA: Resolvendo incompatibilidades entre números e Strings
        
        //Convertendo de inteiro para String
        int idade = 30;
        String valor;
        //valor = idade;  //ERRADO!
        //valor = (String) idade; //ERRADO!
        valor = Integer.toString(idade); //CORRETO!
        System.out.println("Valor de inteiro para String: "+valor);
        
        //Fazendo o Contrário: de String para inteiro
        String idade2 = "30";
        int valor2;
        //valor3 = (int) idade2; //ERRADO!
        valor2 = Integer.parseInt(idade2); //CORRETO!
        System.out.println("Valor de String para inteiro: "+valor2);
        
        
        
        
        
        
        //De String para Float
        String idade3 = "30";
        float valor3;
        //valor3 = (float) idade3; //ERRADO!
        valor3 = Float.parseFloat(idade3); //CORRETO!
        System.out.println("Valor de String para float: "+valor3);
        
        
        //De Float para String
        String idade4; 
        float valor4 = 30;
        //valor4 = (String) idade4; //ERRADO!
        idade4 = Float.toString(valor4); //CORRETO!
        System.out.println("Valor de float para String: "+valor3);
        
        


        

        //De String para Double
        String idade5 = "30";
        Double valor5;
        //valor5 = (double) idade5; //ERRADO!
        valor5 = Double.parseDouble(idade5); //CORRETO!
        System.out.println("Valor de String para double: "+valor5);
        
        //De Double para String
        String idade6;
        Double valor6 = (double) 30;
        //idade6 = (double) valor6; //ERRADO!
        idade6 = Double.toString(valor6); //CORRETO!
        System.out.println("Valor de double para String: "+valor6);
        
        
        
        
        
        //De boolean para String
        boolean status = true;
        String status2 = Boolean.toString(status);
        
        //De string para boolean
        boolean status3;
        String status4 = "true";
        status3 = Boolean.parseBoolean(valor);
        System.out.println("Valor do boolean: "+status3);
        
        
        char a = 'a';
        String b = Character.toString(a);
        
    }
}
