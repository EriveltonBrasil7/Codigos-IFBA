/*
    - A definição dos dados fica muito fraca
    - Pois sempre vai precisar definir os dados no local que precisar cadastrar
    - Dificultando as adaptações ou manutenções dos dados
 */
package introducao_oo;

public class CadastroClienteProcedural {

    public static void main(String[] args) {
        //#########################################
        //CADASTRAR  CLIENTES
        //#########################################
        Object[][] listaClientes = new Object[3][3];

        String nomeCliente1 = "Eliomar Campos";
        String cpfCliente1 = "000.000.000-00";
        double salarioCliente1 = 12000.54;
        //Adicionando o Cliente 1 na primeira linha da lista
        listaClientes[0][0] = nomeCliente1;
        listaClientes[0][1] = cpfCliente1;
        listaClientes[0][2] = salarioCliente1;

        String nomeCliente2 = "Maria José";
        String cpfCliente2 = "021.020.110-00";
        double salarioCliente2 = 1000.4;
        //Adicionando o Cliente 2 na segunda linha da lista
        listaClientes[1][0] = nomeCliente2;
        listaClientes[1][1] = cpfCliente2;
        listaClientes[1][2] = salarioCliente2;

        String nomeCliente3 = "José Maria";
        String cpfCliente3 = "010.200.220-01";
        double salarioCliente3 = 11000;
        //Adicionando o Cliente 3 na terceira linha da lista
        listaClientes[2][0] = nomeCliente3;
        listaClientes[2][1] = cpfCliente3;
        listaClientes[2][2] = salarioCliente3;

        //#########################################
        //LISTAR CLIENTES SEM A LISTA
        //#########################################
//        System.out.println("CLIENTE 01:");
//        System.out.println("Nome: " + nomeCliente1);
//        System.out.println("CPF: " + cpfCliente1);
//        System.out.println("Salário: " + salarioCliente1);
//
//        System.out.println("\nCLIENTE 02:");
//        System.out.println("Nome: " + nomeCliente2);
//        System.out.println("CPF: " + cpfCliente2);
//        System.out.println("Salário: " + salarioCliente2);
//
//        System.out.println("\nCLIENTE 03:");
//        System.out.println("Nome: " + nomeCliente3);
//        System.out.println("CPF: " + cpfCliente3);
//        System.out.println("Salário: " + salarioCliente3);

        //#########################################
        //LISTAR CLIENTES COM A LISTA
        //#########################################   
        for (int linha = 0; linha < listaClientes.length; linha++) {
                System.out.println("\nCLIENTE " + (linha+1) + ":");
                System.out.println("Nome: " + listaClientes[linha][0]);
                System.out.println("CPF: " + listaClientes[linha][1]);
                System.out.println("Salário: " + listaClientes[linha][2]);       
        }

    }
}
