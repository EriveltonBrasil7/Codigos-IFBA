package paradigma_orientado_objetos;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String anoModelo;
    private String placa;
    private String cor;
    private double precoDiaria;
    private String status;
    private Categoria categoria; 

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String anoModelo, String placa, String cor, double precoDiaria, String status) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.placa = placa;
        this.cor = cor;
        this.precoDiaria = precoDiaria;
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
    
    
}
