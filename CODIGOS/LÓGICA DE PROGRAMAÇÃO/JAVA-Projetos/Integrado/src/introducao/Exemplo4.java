package introducao;

public class Exemplo4 {
    public static void main(String[] args) {
        //TIPO BOOLEAN e OPERADORES LÓGICOS
        int a=5, b=7, c=12;
        
        boolean resultado = (a<b && a==c);
        System.out.println("Resposta do &&: "+resultado);
        
        resultado = (a<b || a==c);
        System.out.println("Resposta do ||: "+resultado);
        
    }
     
}
