package paradigma_orientado_objetos;

public class Cliente extends Pessoa{  //extends indica que esta classe está herdando todo o código da classe Pessoa (seus atributos e métodos)
    private int diaVencimento;
    private int pontosFidelidade;
    
    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    
    
    
      
    
    
}
