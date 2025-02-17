
package basicas;

import java.util.Date;

/**
 *
 * @author eliomar.campos
 */
public class Locacao {
    private int id;
    private Date dataEntrega;
    private Date dataDevolucao;
    private String status;
    private Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(int id, Date dataEntrega, Date dataDevolucao, String status, Veiculo veiculo) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
