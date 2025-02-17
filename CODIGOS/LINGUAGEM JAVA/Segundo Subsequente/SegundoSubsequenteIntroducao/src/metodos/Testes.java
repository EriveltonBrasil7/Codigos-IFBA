package metodos;

public class Testes {
    public static void main(String[] args) {
        UtilidadesMath.testar();
        UtilidadesMath um = new UtilidadesMath();
        um.testar2();
        um.idade = 10;
        System.out.println("Idade "+um.idade);
        int f = um.idade;
        System.out.println("resultado f"+f );
    }
}
