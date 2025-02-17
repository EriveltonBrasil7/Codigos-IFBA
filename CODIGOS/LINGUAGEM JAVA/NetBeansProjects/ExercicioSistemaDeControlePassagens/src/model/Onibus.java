
package model;

import java.util.ArrayList;

public class Onibus {
    private int id;
    private String placa;
    private String tipo;
    private ArrayList<Poltrona>poltronas;

    public Onibus() {
    }

    public Onibus(int id, String placa, String tipo) {
        this.id = id;
        this.placa = placa;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
