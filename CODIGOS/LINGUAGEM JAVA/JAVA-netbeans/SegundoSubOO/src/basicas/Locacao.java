package basicas;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {

    private int id;
    private Date dataEntrega;
    private Date dataDevolucao;
    private double valorTotal;
    private Cliente clienteTitular;
    private Funcionario funcionario;
    private Veiculo veiculo;
    private ArrayList<Cliente> acompanhantes;

    public Locacao() {

    }

    public Locacao(int id, Date dataEntrega, Date dataDevolucao, double valorTotal, Cliente clienteTitular, Funcionario funcionario, Veiculo veiculo, ArrayList<Cliente> acompanhantes) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.clienteTitular = clienteTitular;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.acompanhantes = acompanhantes;
    }

    public ArrayList<Cliente> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(ArrayList<Cliente> acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public void calcularValorTotal(double valorDesconto, double valorMulta) {
        this.valorTotal = (((40 + 50 + 60) * 10) - valorDesconto) + valorMulta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void exibirDetalhes() {
        System.out.println("*********RECIBO DE LOCAÇÃO***********");
        System.out.println("Código: " + id);
        System.out.println("Data de Entrega: " + dataEntrega);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("Código Cliente: " + clienteTitular.getId());
        System.out.println("Nome Cliente: " + clienteTitular.getNome());
        System.out.println("Código Funcionário: " + funcionario.getId());
        System.out.println("Nome Funcionário: " + funcionario.getNome());
        System.out.println("Código Veículo: " + veiculo.getId());
        System.out.println("Modelo do Veículo: " + veiculo.getModelo());

        System.out.println("---LISTA DE ACOMPANHANTES---");

//        Cliente acomp = acompanhantes.get(0);
//        System.out.println("Código: "+acomp.getId());
//        System.out.println("Nome: "+acomp.getNome());
//        
//        acomp = acompanhantes.get(1);
//        System.out.println("Código: "+acomp.getId());
//        System.out.println("Nome: "+acomp.getNome());
//        
//        acomp = acompanhantes.get(2);
//        System.out.println("Código: "+acomp.getId());
//        System.out.println("Nome: "+acomp.getNome());

        for (Cliente acom : acompanhantes) {
            System.out.println("Código: " + acom.getId());
            System.out.println("Nome: " + acom.getNome());
        }

    }

}
