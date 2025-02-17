
package testes;

import model.Funcionario;
import model.Passageiros;

public class SistemaViacao {
    public static void main(String[] args) {
        Passageiros passa1 = new Passageiros();
        passa1.setNome("Erivelton");
        passa1.setCelular("996247141");
        
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Karoline");
        fun1.setFuncao("vendedora");
        
        
        
        
        
        
        
        
        
        
        System.out.println("-------FUNCIONÁRIOS-------");
        System.out.println("Nome: "+fun1.getNome());
        System.out.println("Função: "+fun1.getFuncao());
        
        System.out.println("-------PASSAGEIROS-------");
        System.out.println("Nome: "+passa1.getNome());
        System.out.println("Celular: "+passa1.getCelular());
    }
}
