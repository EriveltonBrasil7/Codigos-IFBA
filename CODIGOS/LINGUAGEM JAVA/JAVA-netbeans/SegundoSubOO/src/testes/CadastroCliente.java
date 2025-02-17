package testes;

import basicas.Cliente;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente();//o comando new cria um novo objeto na memória
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente("Jesus");
        Cliente cli4 = new Cliente(4, "Ana Vitoria","F", "504949404", "515051544", "120510", "Adolfo Santos", "", null, null);
        
        
        System.out.println(cli1);//exibe o endereço do objeto na memória
        System.out.println(cli2);
        System.out.println(cli4);
        System.out.println(cli1.getNome());
        System.out.println(cli2.getNome());
        System.out.println(cli3.getNome());
        
        
        

        //Preechendo o cliente 1
        cli1.setId(1);
        cli1.setNome("Erivelton"); 
        cli1.setBairro("Centro");
        cli1.setCidade("Delmiro");
        cli1.setCnh("10161610"); 
        cli1.setCpf("1154154545");
        cli1.setRg("4151510");
        cli1.setRua("Travessa");
        cli1.setSexo("M");

        //Preechencdo o cliente 2
        cli2.setId(2);
        cli2.setNome("Karoline");
        cli2.setBairro("Centro");
        cli2.setCidade("Paulo Afonso"); 
        cli2.setCnh( "41848484");
        cli2.setCpf("8584610169"); 
        cli2.setRg("84840665"); 
        cli2.setRua("Batista");
        cli2.setSexo("F");

        //Exibindo os dados do cliente 1
        System.out.println("CLIENTE 1:");
        System.out.println("Código:" + cli1.getId());
        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Sexo: "+cli1.getSexo());
        System.out.println("Bairro: " + cli1.getBairro());
        System.out.println("Cidade: " + cli1.getCidade());
        System.out.println("CNH : " + cli1.getCnh());
        System.out.println("CPF: " + cli1.getCpf());
        System.out.println("RG :" + cli1.getRg());
        System.out.println("Rua: " + cli1.getRua());
        

        //Exibindo os dados do cliente 2
        System.out.println("\nCLIENTE 2:");
        System.out.println("Código:" + cli2.getId());
        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Sexo: "+cli2.getSexo());
        System.out.println("Bairro: " + cli2.getBairro());
        System.out.println("Cidade: " + cli2.getCidade());
        System.out.println("CNH : " + cli2.getCnh());
        System.out.println("CPF: " + cli2.getCpf());
        System.out.println("RG :" + cli2.getRg());
        System.out.println("Rua: " + cli2.getRua());
        
        
        //Exibindo os dados do cliente 4
        System.out.println("\nCLIENTE 4:");
        System.out.println("Código:" + cli4.getId());
        System.out.println("Nome: " + cli4.getNome());
        System.out.println("Sexo: "+cli4.getSexo());
        System.out.println("Bairro: " + cli4.getBairro());
        System.out.println("Cidade: " + cli4.getCidade());
        System.out.println("CNH : " +  cli4.getCnh());
        System.out.println("CPF: " + cli4.getCpf());
        System.out.println("RG :" + cli4.getRg());
        System.out.println("Rua: " + cli2.getRua());
    }
}
