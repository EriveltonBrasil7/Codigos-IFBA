package introducao;

public class Exemplo03 {
    public static void main(String[] args) {
        int idade = 30;
        float altura = (float)1.85;
        double salario = 954.44;
        String nome = "José da Silva";
        idade = (int)salario;
        
        System.out.println("Idade: "+idade);
        
        //Classes Wrapper (invólucro)
        Integer idade2 = 35;
        Float altura2 = (float)5;
        Double salario2 = (double)400;
        //convertendo de Integer para String
        String nome2 = idade2.toString();
        //Convertendo de String para int
        String rg = "100";
        int rg2 = Integer.parseInt(rg);  
        System.out.println("RG: "+rg2);
        //convertendo de float para String
        nome = Float.toString(altura);  
        //convertendo de String para float
        altura = Float.parseFloat(rg); 
        
    }
}
