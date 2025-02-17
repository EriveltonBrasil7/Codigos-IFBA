package paradigma_orientado_objetos;

public class CadastroCliente {
    public static void main(String[] args) {
         Endereco end = new Endereco();
         end.setBairro("BNH");
         end.setCidade("Paulo Afonso");
         end.setNumeroCasa("32");
         end.setRua("Barcelona");
         
         Endereco end2 = new Endereco("São sebastião", "Novo", "30A", "Paulo Afonso");
         
         //Cliente clie3 = new Cliente("Maria Gomes", "83838333", 500, "maria@gmail", end2);
         //clie3.setNome("Maria Gomes da Silva"); 
         
         Cliente clie = new Cliente();
         clie.setCpf("000.000.000-00");
         clie.setEmail("eliomar@gmail.com");
         clie.setNome("Eliomar Campos");
         clie.setEndereco(end);
         
         Cliente clie2 = new Cliente();
         clie2.setCpf("022.010.011-20");
         clie2.setEmail("eleomar@gmail.com");
         clie2.setNome("Eleomar Lopes Campos");
         clie2.setEndereco(end); 
         
         
         //Exibindo os dados
//         clie.imprimirTodosDados();
//         clie.end.imprimirTodosDados();
//         
//         clie2.imprimirTodosDados();
//         clie2.end.imprimirTodosDados();
         
           //Imprimindo apenas 1 atributo
           System.out.println("CLIENTE 1:");
           System.out.println("Nome: "+clie.getNome());
           System.out.println("CPF: "+clie.getCpf());
           System.out.println("Email: "+clie.getEmail());
           System.out.println("Rua: "+clie.getEndereco().getRua());
           System.out.println("Cidade: "+clie.getEndereco().getCidade());
           
//           System.out.println("Nome: "+clie3.getNome());
//           System.out.println("Rua: "+clie3.getEndereco().getRua());
    }
  
}
