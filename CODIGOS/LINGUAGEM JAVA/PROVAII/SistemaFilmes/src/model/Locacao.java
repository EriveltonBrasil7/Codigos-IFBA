package model;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {
    private int id;
    private Date dataLocacao;
    private Date dataDevolucao;
    private String status;
    private double valorTotal;
    private String formaPagamento;
    private Endereco enderEntrega;
    private Cliente cliente;
    private Funcionario funcionario;
    private ArrayList<Midia> midias;

    public Locacao() {
    }

    public Locacao(int id, Date dataLocacao, Date dataDevolucao, String status, double valorTotal, String formaPagamento, Endereco enderEntrega, Cliente cliente, Funcionario funcionario, ArrayList<Midia> midias) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.enderEntrega = enderEntrega;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.midias = midias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Endereco getEnderEntrega() {
        return enderEntrega;
    }

    public void setEnderEntrega(Endereco enderEntrega) {
        this.enderEntrega = enderEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
       
        this.midias = midias;
    }
    
}
