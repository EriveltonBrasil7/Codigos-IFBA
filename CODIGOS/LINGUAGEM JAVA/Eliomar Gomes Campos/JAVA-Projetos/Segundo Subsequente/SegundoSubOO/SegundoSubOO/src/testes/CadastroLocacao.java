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
        cli1.setNome("Eliomar Campos");
        
        Cliente acompanhante1 = new Cliente();
        acompanhante1.setId(2);
        acompanhante1.setNome("Derek Campos");
        
        Cliente acompanhante2 = new Cliente();
        acompanhante2.setId(3);
        acompanhante2.setNome("Eriosvaldo");
        
        Cliente acompanhante3 = new Cliente();
        acompanhante3.setId(71);
        acompanhante3.setNome("Arnoldshuazinegar");
        
        //Declarando e inserindo no ArrayList
        ArrayList<Cliente> listaDeAcompanhantes = new ArrayList<>();
        listaDeAcompanhantes.add(acompanhante1);
        listaDeAcompanhantes.add(acompanhante2);
        listaDeAcompanhantes.add(acompanhante3);
        
        
        Funcionario fun1 = new Funcionario();
        fun1.setId(1);
        fun1.setNome("Adalberto"); 
        
        Veiculo vei = new Veiculo();
        vei.setId(1);
        vei.setModelo("Cruze");
        vei.setMontadora("Chevrolet");
        
                
        Locacao loca1 = new Locacao();
        loca1.setId(1);
        loca1.setClienteTitular(cli1);
        loca1.setFuncionario(fun1);
        loca1.setVeiculo(vei); 
        loca1.setAcompanhantes(listaDeAcompanhantes); 
        loca1.calcularValorTotal(100, 10);
        
        
        Locacao loca2 = new Locacao();
        loca2.setId(2);
        loca2.setClienteTitular(cli1);
        loca2.setFuncionario(fun1);
        loca2.setVeiculo(vei); 
        loca2.setAcompanhantes(listaDeAcompanhantes); 
        loca1.calcularValorTotal(0, 0);
        
        loca1.exibirDetalhes();
        loca2.exibirDetalhes();
//        System.out.println("*****RECIBO DE LOCAÇÃO*****");
//        System.out.println("Código: "+loca1.getId());
//        System.out.println("Data Entrega: "+loca1.getDataEntrega());
//        System.out.println("Data Devolução: "+loca1.getDataDevolucao());
//        System.out.println("Código Cliente: "+loca1.getCliente().getId());
//        System.out.println("Nome Cliente: "+loca1.getCliente().getNome());
//        System.out.println("Código Funcionário: "+loca1.getFuncionario().getId());
//        System.out.println("Nome Funcionário: "+loca1.getFuncionario().getNome());
//        System.out.println("Código do Veículo: "+loca1.getVeiculo().getId());
//        System.out.println("Modelo do Veículo: "+loca1.getVeiculo().getModelo());
//        
//        System.out.println("Código: "+loca2.getId());
//        System.out.println("Data Entrega: "+loca2.getDataEntrega());
//        System.out.println("Data Devolução: "+loca2.getDataDevolucao());
//        System.out.println("Código Cliente: "+loca2.getCliente().getId());
//        System.out.println("Nome Cliente: "+loca2.getCliente().getNome());
//        System.out.println("Nome Funcionário: "+loca2.getFuncionario().getNome());
//        System.out.println("Código do Veículo: "+loca2.getVeiculo().getId());
//        System.out.println("Modelo do Veículo: "+loca2.getVeiculo().getModelo());
        
        
    }
}
