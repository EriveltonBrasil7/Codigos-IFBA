
package basicas;

public class Obra {
    private int id;
    private String titulo;
    private String isbn;
    private String anoPublicacao;
    private String idioma;
    private String area;
    private String assunto;
    private Autor autor;
    private Tipo tipo;

    public Obra(int id, String titulo, String isbn, String anoPublicacao, String idioma, String area, String assunto, Autor autor, Tipo tipo) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.idioma = idioma;
        this.area = area;
        this.assunto = assunto;
        this.autor = autor;
        this.tipo = tipo;
    }
    public Obra(){
    
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
