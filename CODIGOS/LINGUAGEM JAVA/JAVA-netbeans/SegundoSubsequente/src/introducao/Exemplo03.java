package introducao;

public class Exemplo03 {
    public static void main(String[] args) {
        //Tipos primitivos
        double nota1 = 5.555544; 
        int nota2 = (int)6.5333; //casting (convertendo double pra int)
        System.out.println("Nota 2: "+nota2);
        
        //Tipos Classes Wrapper(invólucro) (não primitivos)
        String nome = "Eliomar !!@@##$$%´~~~´´";
        Float nota3 = (float)5.444;
        Double nota4 = 5.3333;
        Integer nota5 = 6;
        System.out.println("Nome: "+nome);
        
        //Convertendo String para Float
        String salario = "950.8";
        String horaExtra = "100";
        float salarioAux = Float.parseFloat(salario);
        float horaExtraAux = Float.parseFloat(horaExtra);
        float salarioTotal = salarioAux + horaExtraAux; 
        
        System.out.println("Salário Total: "+salarioTotal);
        
        //Convertendo Float para String
        float salario1 = (float)950.8;
        //String salarioAux1 = Float.toString(salario1);
        String salarioAux1 = ""+salario1;
        System.out.println("Salário 1: "+salarioAux1);
        
        //Convertendo de String para Double
        String salario2 = "40.5";
        double salarioAux2 = Double.parseDouble(salario2);
        System.out.println("Salário 2: "+salarioAux2);
        
        //Convertendo de String para Integer
        String salario3 = "30";
        int salarioAux3 = Integer.parseInt(salario3);
        System.out.println("Salário 3: "+salarioAux3);
    }
    
}
