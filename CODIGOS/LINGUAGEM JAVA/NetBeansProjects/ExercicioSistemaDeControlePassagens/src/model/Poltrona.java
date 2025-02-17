
package model;





public class Poltrona {
    private int id;
    private String numero;
    private String tipo;
    private boolean disponivel;
    private Onibus onibus;
   

    public Poltrona() {
    }

    public Poltrona(int id, String numero, String tipo, boolean disponivel, Onibus onibus) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.disponivel = disponivel;
        this.onibus = onibus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

   
    
}
