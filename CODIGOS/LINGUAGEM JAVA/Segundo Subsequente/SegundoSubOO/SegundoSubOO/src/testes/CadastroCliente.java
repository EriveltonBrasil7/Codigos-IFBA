package testes;

import basicas.Cliente;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(); //o comando new cria um novo objeto na memória
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente("Jesus"); 
        Cliente cli4 = new Cliente(40, "Eliomar Campos", "M", "777.222.222-22", "636363", "12312", null, null, null, null);
              
        System.out.println(cli1); //exibe o endereço do objeto na memória
        System.out.println(cli2);
        System.out.println(cli3);
        System.out.println(cli4);
        System.out.println(cli1.getNome());
        System.out.println(cli2.getNome());
        System.out.println(cli3.getNome());
        
        
        
        //Preenchendo o cliente 1
        cli1.setId(1);
        cli1.setNome("José Gomes");
        cli1.setBairro("Centro");
        cli1.setCidade("Delmiro Gouveia");
        cli1.setRua("Rua marechal deodoro");
        
        //Preenchendo o cliente 2
        cli2.setId(2);
        cli2.setNome("Maria Gomes");
        cli2.setBairro("Barroca");
        cli2.setCidade("Paulo Afonso");
        cli2.setRua("Rua delmiro gouveia");
        
        //Exibindo os dados do cliente 1
        System.out.println("CLIENTE 1:");
        System.out.println("Código: "+cli1.getId());
        System.out.println("Nome: "+cli1.getNome());
        System.out.println("Sexo: "+cli1.getSexo());
        System.out.println("CPF: "+cli1.getCpf());
        System.out.println("RG: "+cli1.getRg());
        System.out.println("Rua: "+cli1.getRua());
        System.out.println("Bairro: "+cli1.getBairro());
        System.out.println("Cidade: "+cli1.getCidade());
        System.out.println("Nascimento: "+cli1.getNascimento());
        
        //Exibindo os dados do cliente 2
        System.out.println("CLIENTE 2:");
        System.out.println("Código: "+cli2.getId());
        System.out.println("Nome: "+cli2.getNome());
        System.out.println("Sexo: "+cli2.getSexo());
        System.out.println("CPF: "+cli2.getCpf());
        System.out.println("RG: "+cli2.getRg());
        System.out.println("Rua: "+cli2.getRua());
        System.out.println("Bairro: "+cli2.getBairro());
        System.out.println("Cidade: "+cli2.getCidade());
        System.out.println("Nascimento: "+cli2.getNascimento());
        
        //Exibindo os dados do cliente 4
        System.out.println("CLIENTE 4:");
        System.out.println("Código: "+cli4.getId());
        System.out.println("Nome: "+cli4.getNome());
        System.out.println("Sexo: "+cli4.getSexo());
        System.out.println("CPF: "+cli4.getCpf());
        System.out.println("RG: "+cli4.getRg());
        System.out.println("Rua: "+cli4.getRua());
        System.out.println("Bairro: "+cli4.getBairro());
        System.out.println("Cidade: "+cli4.getCidade());
        System.out.println("Nascimento: "+cli4.getNascimento());
    }
}
