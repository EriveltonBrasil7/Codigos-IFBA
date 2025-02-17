package model;

public class Veiculo {
    private int id;
    private String marca;
    private String placa;
    private String modelo;
    private String anoModelo;
    private String cor;
    private double valorDiaria;
    private String status;
    private Categoria categoria;

    public Veiculo() {
    }

    public Veiculo(int id, String marca, String placa, String modelo, String anoModelo, String cor, double valorDiaria, String status, Categoria categoria) {
        this.id = id;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.status = status;
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}
