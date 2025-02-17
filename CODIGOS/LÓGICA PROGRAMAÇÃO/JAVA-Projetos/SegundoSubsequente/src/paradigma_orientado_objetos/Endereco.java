
package paradigma_orientado_objetos;


public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String numeroCasa;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String numeroCasa, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
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

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
    
    void imprimirTodosDados(){
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Número da Casa: " + numeroCasa);
        System.out.println("Cidade: " + cidade + "\n");
    }
    
    
}
