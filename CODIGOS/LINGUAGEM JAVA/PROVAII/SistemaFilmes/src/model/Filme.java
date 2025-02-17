package model;

import java.util.ArrayList;

public class Filme {
    private int id;
    private String titulo;
    private String sinopse;
    private String genero;
    private double valor;
    private ArrayList<Midia> midias;

    public Filme() {
    }

    public Filme(int id, String titulo, String sinopse, String genero, double valor, ArrayList<Midia> midias) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.valor = valor;
        this.midias = midias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }
    
}
