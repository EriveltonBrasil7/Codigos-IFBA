
package model;

import java.util.Date;

public class Passagem {
    private int id;
    private Date dataCompra;
    private double dataEmbarque;
    private double desconto;
    private double valorTotal;
    private Local destino;
    private Local origem;
    private Poltrona poltrona;
    private Passageiros passageiro;
    private Funcionario funcionario;
    private Local local;
    private Onibus onibus;

    public Passagem() {
    }

    public Passagem(int id, Date dataCompra, double dataEmbarque, double desconto, double valorTotal, Local destino, Local origem, Poltrona poltrona, Passageiros passageiro, Funcionario funcionario, Local local, Onibus onibus) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.dataEmbarque = dataEmbarque;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.destino = destino;
        this.origem = origem;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.funcionario = funcionario;
        this.local = local;
        this.onibus = onibus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(double dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Local getDestino() {
        return destino;
    }

    public void setDestino(Local destino) {
        this.destino = destino;
    }

    public Local getOrigem() {
        return origem;
    }

    public void setOrigem(Local origem) {
        this.origem = origem;
    }

    public Poltrona getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(Poltrona poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiros getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    
   

   
    
}
