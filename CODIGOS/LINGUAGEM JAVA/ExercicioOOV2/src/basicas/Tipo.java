
package basicas;

import java.util.ArrayList;

public class Tipo {
    private int id;
    private String nome;
    private ArrayList<Obra> obras;

    public Tipo(int id, String nome, ArrayList<Obra> obras) {
        this.id = id;
        this.nome = nome;
        this.obras = obras;
    }
     public Tipo(){
     
     }

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

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
     
}
