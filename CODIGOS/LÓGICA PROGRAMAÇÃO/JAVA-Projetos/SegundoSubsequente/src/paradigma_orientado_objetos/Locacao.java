package paradigma_orientado_objetos;

import java.util.Date;

public class Locacao {
   private int id;
   private Date dataSaida;
   private Date dataEntrega;
   private double valor;
   private String status;
   private Cliente cliente;
   private Funcionario funcionario;
   private Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(Date dataSaida, Date dataEntrega, double valor, String status, Cliente cliente, Funcionario funcionario, Veiculo veiculo) {
        this.dataSaida = dataSaida;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void calcularTotalPagar(){
         
    }
}

   