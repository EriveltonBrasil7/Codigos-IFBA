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
public class Pessoa {
    private int id;
    private String nome;
    private Veiculo carroSobResponsa;
    private ArrayList<Veiculo> carrosDirigidos;
    private ArrayList<Veiculo> carrosPossuidos;
    private Pessoa chefe;
    
    

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

    public Veiculo getCarroSobResponsa() {
        return carroSobResponsa;
    }

    public void setCarroSobResponsa(Veiculo carroSobResponsa) {
        this.carroSobResponsa = carroSobResponsa;
    }

    public ArrayList<Veiculo> getCarrosDirigidos() {
        return carrosDirigidos;
    }

    public void setCarrosDirigidos(ArrayList<Veiculo> carrosDirigidos) {
        this.carrosDirigidos = carrosDirigidos;
    }

    public ArrayList<Veiculo> getCarrosPossuidos() {
        return carrosPossuidos;
    }

    public void setCarrosPossuidos(ArrayList<Veiculo> carrosPossuidos) {
        this.carrosPossuidos = carrosPossuidos;
    }

    public Pessoa getChefe() {
        return chefe;
    }

    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }
    
}
