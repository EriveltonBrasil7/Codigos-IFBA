/*
    - Agora sim, os dados estão bem definidos e organizados, centralizados em um único local
    - A classe Cliente serve como uma referência/molde/forma/modelo/regra para como os objetos serão criados e definidos 
    - Todos os objetos devem ser criados obedecendo as mesmas características da classe
    - Os dados ficam fortemente tipados
    - Isso ajuda na manutenção dos dados
    - Além disso, a classe define todo o compotamente dos seus objetos
 */
package introducao_oo;

import java.util.ArrayList;

public class CadastroCliente1 {

    public static void main(String[] args) {
        //#########################################
        //CADASTRAR  CLIENTES
        //#########################################
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente clie1 = new Cliente();
        clie1.nome = "Eliomar Campos";
        clie1.cpf = "000.000.000-00";
        clie1.salario = 12000.54;
        //clie1.imprimirTodosDados(); //Se preferir exibir logo um por um
        //Adicionando o Cliente 1 na lista
        listaClientes.add(clie1);

        Cliente clie2 = new Cliente("Maria José", "021.020.110-00", 1000.4);
        //clie2.imprimirTodosDados();
        //Adicionando o Cliente 2 na lista
       listaClientes.add(clie2);

        //Adicionando o Cliente 3 na terceira linha da lista
        Cliente clie3 = new Cliente();
        clie3.nome = "José Maria";
        clie3.cpf = "010.200.220-01";
        clie3.salario = 11000;
        //clie3.imprimirTodosDados();
        listaClientes.add(clie3);

        //#########################################
        //LISTAR CLIENTES SEM A LISTA
        //#########################################
//        System.out.println("CLIENTE 01:");
//        System.out.println("Nome: " + clie1.nome);
//        System.out.println("CPF: " + clie1.cpf);
//        System.out.println("Salário: " + clie1.salario);
//
//        System.out.println("\nCLIENTE 02:");
//        System.out.println("Nome: " + clie2.nome);
//        System.out.println("CPF: " + clie2.cpf);
//        System.out.println("Salário: " + clie2.salario);
//
//        System.out.println("\nCLIENTE 03:");
//        System.out.println("Nome: " + clie2.nome);
//        System.out.println("CPF: " + clie2.cpf);
//        System.out.println("Salário: " + clie2.salario);

        //#########################################
        //LISTAR CLIENTES COM A LISTA
        //#########################################   
//        for (int posicao = 0; posicao < listaClientes.size(); posicao++) {
//            Cliente cliente = listaClientes.get(posicao);
//            System.out.println("\nCLIENTE " + (posicao + 1) + ":");
//            System.out.println("Nome: " + cliente.nome);
//            System.out.println("CPF: " + cliente.cpf);
//            System.out.println("Salário: " + cliente.salario);
//        }
        
        //#########################################
        //LISTAR CLIENTES COM A LISTA - DE OUTRA FORMA
        //#########################################       
//        for (Cliente cliente : listaClientes) {         
//            System.out.println("\nCLIENTE:");
//            System.out.println("Nome: " + cliente.nome);
//            System.out.println("CPF: " + cliente.cpf);
//            System.out.println("Salário: " + cliente.salario);
//        }
        
        
        //#########################################
        //LISTAR CLIENTES COM O MÉTODO DA PRÓPRIA CLASSE - DE OUTRA FORMA
        //######################################### 
        for(Cliente cliente : listaClientes){
            System.out.println("\nCLIENTE:");
            cliente.imprimirTodosDados();
        }
        
        
    }
}
