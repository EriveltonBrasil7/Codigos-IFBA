package testes;

import basicas.Cliente;
import basicas.Funcionario;
import basicas.Locacao;
import basicas.Veiculo;
import java.util.ArrayList;

public class CadastroLocacao {

    public static void main(String[] args) {

        Cliente cli1 = new Cliente();
        cli1.setId(1);
        cli1.setNome("Erivelton Brasil");

        Cliente acompanhante1 = new Cliente();
        acompanhante1.setId(2);
        acompanhante1.setNome("José de Jesus");

        Cliente acompanhante2 = new Cliente();
        acompanhante2.setId(3);
        acompanhante2.setNome("Eriosvaldo");

        Cliente acompanhante3 = new Cliente();
        acompanhante3.setId(51);
        acompanhante3.setNome("Arnold Shuasnegger");

        //DECLARANDO E INSERINDO UM ARRAYLIST
        ArrayList<Cliente> listaDeAcompanhantes = new ArrayList<>();
        listaDeAcompanhantes.add(acompanhante1);
        listaDeAcompanhantes.add(acompanhante2);
        listaDeAcompanhantes.add(acompanhante3);

        Funcionario fun1 = new Funcionario();
        fun1.setId(5);
        fun1.setNome("Karoline");

        Veiculo veic = new Veiculo();
        veic.setId(10);
        veic.setCor("Azul");
        veic.setStatus("Disponível");
        veic.setModelo("Celta");

        Locacao loca1 = new Locacao();
        loca1.setId(1);
        loca1.setClienteTitular(cli1);
        loca1.setFuncionario(fun1);
        loca1.setVeiculo(veic);
        loca1.setAcompanhantes(listaDeAcompanhantes);

        Locacao loca2 = new Locacao();
        loca2.setId(2);
        loca2.setClienteTitular(cli1);
        loca2.setFuncionario(fun1);
        loca2.setVeiculo(veic);
        loca2.setAcompanhantes(listaDeAcompanhantes);

        Locacao loca3 = new Locacao();
        loca3.setId(3);
        loca3.setClienteTitular(cli1);
        loca3.setFuncionario(fun1);
        loca3.setVeiculo(veic);
        loca3.setAcompanhantes(listaDeAcompanhantes);

        loca1.exibirDetalhes();
        loca2.exibirDetalhes();
//        System.out.println("*********RECIBO DE LOCAÇÃO***********");
//        System.out.println("Código: " + loca1.getId());
//        System.out.println("Data de Entrega: " + loca1.getDataEntrega());
//        System.out.println("Data de Devolução: " + loca1.getDataDevolucao());
//        System.out.println("Código Cliente: " + loca1.getCliente().getId());
//        System.out.println("Nome Cliente: " + loca1.getCliente().getNome());
//        System.out.println("Código Funcionário: " + loca1.getFuncionario().getId());
//        System.out.println("Nome Funcionário: " + loca1.getFuncionario().getNome());
//        System.out.println("Código Veículo: " + loca1.getVeiculo().getId());
//        System.out.println("Modelo do Veículo: " + loca1.getVeiculo().getModelo());

//        System.out.println("\nCódigo: " + loca2.getId());
//        System.out.println("Data de Entrega: " + loca2.getDataEntrega());
//        System.out.println("Data de Devolução: " + loca2.getDataDevolucao());
//        System.out.println("Código Cliente: " + loca2.getCliente().getId());
//        System.out.println("Nome Cliente: " + loca2.getCliente().getNome());
//        System.out.println("Código Funcionário: " + loca2.getFuncionario().getId());
//        System.out.println("Nome Funcionário: " + loca2.getFuncionario().getNome());
//        System.out.println("Código Veículo: " + loca2.getVeiculo().getId());
//        System.out.println("Modelo do Veículo: " + loca2.getVeiculo().getModelo());
        System.out.println("\n******FUNCIONÁRIO****** ");
        System.out.println("Nome: " + loca1.getFuncionario().getNome());
        System.out.println("Código: " + loca1.getFuncionario().getId());

        System.out.println("\n*********VEÍCULO*********");
        System.out.println("Código: " + veic.getId());
        System.out.println("Cor: " + veic.getCor());
        System.out.println("Status: " + veic.getStatus());
        System.out.println("Modelo: " + veic.getModelo());

    }
}
