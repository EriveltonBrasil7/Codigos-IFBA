package basicas;

public class Veiculo {
    private int id;
    private String modelo;
    private String montadora;
    private String placa;
    private String tipo;
    private String ano;
    private String status;

    public Veiculo() {
    }

    public Veiculo(int id, String modelo, String montadora, String placa, String tipo, String ano, String status) {
        this.id = id;
        this.modelo = modelo;
        this.montadora = montadora;
        this.placa = placa;
        this.tipo = tipo;
        this.ano = ano;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
    
}
