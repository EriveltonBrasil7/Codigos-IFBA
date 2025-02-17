package basicas;

import java.util.Date;


public class Cliente {
    
    public Cliente(){
       
    }
    
    public Cliente(String valor){
        nome = valor;
    }

    public Cliente(int id, String nome, String sexo, String cpf, String rg, String cnh, String rua, String bairro, String cidade, Date nascimento) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.cnh = cnh;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.nascimento = nascimento;
    }
    
    //atributos
    private int id;
    private String nome;
    private String sexo;
    private String cpf;
    private String rg;
    private String cnh;
    private String rua;
    private String bairro;
    private String cidade;
    private Date nascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    
    
    
}
