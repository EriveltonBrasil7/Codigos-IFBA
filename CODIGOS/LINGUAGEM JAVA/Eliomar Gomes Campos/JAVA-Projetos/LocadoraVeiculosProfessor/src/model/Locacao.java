package model;

import java.util.Date;
import java.util.List;

public class Locacao {

    private int id;
    private Date data;
    private Date dataDevolucao;
    private String status;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Veiculo> veiculos;

    public Locacao() {
    }

    public Locacao(int id, Date data, Date dataDevolucao, String status, Cliente cliente, Funcionario funcionario, List<Veiculo> veiculos) {
        this.id = id;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
    
    

}
