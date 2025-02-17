package model;

public class Cliente extends Pessoa{
    private int pontosFidelidade;
    private int diaVencimento;
    private Endereco enderecoCobranca;

    public Cliente() {
    }

    public Cliente(int pontosFidelidade, int diaVencimento, Endereco enderecoCobranca, int id, String nome, String cpfCnpj, String email, String celular, Endereco enderecoResidencial) {
        super(id, nome, cpfCnpj, email, celular, enderecoResidencial);
        this.pontosFidelidade = pontosFidelidade;
        this.diaVencimento = diaVencimento;
        this.enderecoCobranca = enderecoCobranca;
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

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    
    
    
}
