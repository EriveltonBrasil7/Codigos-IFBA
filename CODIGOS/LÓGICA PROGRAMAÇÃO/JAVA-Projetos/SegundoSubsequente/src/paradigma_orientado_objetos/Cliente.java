package paradigma_orientado_objetos;

public class Cliente extends Pessoa{
   private int pontosFidelidade;
   private int diaVencimento;

    public Cliente(int pontosFidelidade, int diaVencimento) {
        this.pontosFidelidade = pontosFidelidade;
        this.diaVencimento = diaVencimento;
    }

    public Cliente() {
    }
   
    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
   
}
