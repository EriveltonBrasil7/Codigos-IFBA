package model;

public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String cep;
    private String numeroCasa;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String rua, String bairro, String cep, String numeroCasa, Cidade cidade) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumero(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
}
