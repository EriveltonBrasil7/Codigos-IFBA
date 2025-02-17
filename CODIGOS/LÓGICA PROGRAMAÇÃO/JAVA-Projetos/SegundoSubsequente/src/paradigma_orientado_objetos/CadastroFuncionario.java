package paradigma_orientado_objetos;

public class CadastroFuncionario {
     public static void main(String[] args) {
          Funcionario func = new Funcionario();
          func.setCpf("672622342");
          func.setEmail("jose@gmail.com");
          func.setFuncao("Analista de Sistemas");
          func.setNome("José Aparecido");
          func.setSalario(34000.50);  
          
          Funcionario func2 = new Funcionario();
          func2.setCpf("44455111");
          func2.setEmail("maria@gmail.com");
          func2.setFuncao("Analista de Negócios");
          func2.setNome("Maria Aparecida");
          func2.setSalario(34001.00);
          
           
          Endereco end = new Endereco("Baronesa", "Prainha", "100", "Paulo Afonso");
          func.setEndereco(end);
          func2.setEndereco(end);
          
          System.out.println("Nome:"+func.getNome());
          System.out.println("Função: "+func.getFuncao());
          System.out.println("Rua: "+func.getEndereco().getRua());
    }
}
