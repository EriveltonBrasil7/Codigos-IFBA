/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.ArrayList;

/**
 *
 * @author eliomar.campos
 */
public class Veiculo {
    private int id;
    private String nome;
    private String placa;
    private String cor;
    private String modelo;
    private String ano;
    private String marca;

    @Override
    public String toString() {
        return "Código: " + id + " - " + nome + " - " + placa;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    public Veiculo() {
    }

    public Veiculo(int id, String nome, String placa, String cor, String modelo, String ano, String marca) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    
     
    
    
    
}
