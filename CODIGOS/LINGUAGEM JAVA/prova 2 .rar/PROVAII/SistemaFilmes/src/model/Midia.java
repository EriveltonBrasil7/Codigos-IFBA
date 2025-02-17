package model;

public class Midia {

    public int id;
    public String codBarra;
    public String status;
    private Filme filme;
    private Tipo tipo;

    public Midia() {
    }

    public Midia(int id, String codBarra, String status, Filme filme, Tipo tipo) {
        this.id = id;
        this.codBarra = codBarra;
        this.status = status;
        this.filme = filme;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
