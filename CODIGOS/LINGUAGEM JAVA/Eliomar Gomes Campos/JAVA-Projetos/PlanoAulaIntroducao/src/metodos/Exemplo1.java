package metodos;

public class Exemplo1 {
    
    public static void main(String[] args) {
        System.out.println("Antes sempre começa aqui no main!!!");
        metodoTeste();
        metodoTeste2(10);
        metodoTeste3(10, 45.5, "Eliomar");
        System.out.println(metodoTeste4());
        System.out.println(metodoTeste5(50));
        System.out.println("Média do aluno: "+metodoTeste6(10, 5));
    }
    
    static void metodoTeste(){
        System.out.println("Depois chama esse método que não retorna nada e não recebe parâmetros!");
    }
    
    //a variável do parâmetro é sempre local
    public static void metodoTeste2(int parametro1){
        System.out.println("Depois chama esse método que não retorna nada e recebe apenas 1 parâmetro com valor "+parametro1);
    }
    
    public static void metodoTeste3(int parametro1, double parametro2, String parametro3){
        System.out.println("Depois chama esse método que não retorna nada e recebe 3 parâmetros com valores: valor 1: "+parametro1+", valor 2: "+parametro2+", valor 3: "+parametro3);
    }
    
    public static String metodoTeste4(){
        String frase = "Depois chama esse método que retorna uma String e não recebe parâmetro";
        return frase;
    }
    
    public static String metodoTeste5(int parametro1){
        String frase = "Depois chama esse método que retorna uma String e recebe apenas 1 parâmetro com valor "+parametro1;
        return frase;
    }
    
    public static double metodoTeste6(double parametro1, double parametro2){
        System.out.println("Depois chama esse método que retorna um decimal, recebe 2 parâmetros, e retorna a média a seguir:");
        double media = (parametro1+parametro2)/2;
        return media;
    }   
    
}
