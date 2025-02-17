package exercicio;

import java.util.Date;

public class Biblioteca {
    //Atributos_Aluno

    private int idAluno;
    private String nomeAluno;
    private String cpfAluno;
    private String matriculaAluno;

    //Atributos_Emprestimo
    private int idEmprestimo;
    private Date data;
    private Date dataDevolucao;
    private String statusEmprestimo;

    //Atributos_Endereço
    private int idEndereco;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    //Atributos_Obras
    private int idObras;
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private String idioma;
    private String area;
    private String assunto;

    //Atributos_tipo
    private int idTipo;
    private String nomeTipo;

    //Atributos_Autor
    private int idAutor;
    private String nomeAutor;
    private String cpfAutor;
    private String ultimoNome;
    private String titulacao;

    Biblioteca() {

    }

    public void statusAluno() {
        System.out.println("------ALUNO------");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Código: " + idAluno);
        System.out.println("CPF: " + cpfAluno);
        System.out.println("Matrícula: " + matriculaAluno);

    }

    public void statusEmprestimo() {
        System.out.println("------EMPRÉSTIMO------");
        System.out.println("Código: " + idEmprestimo);
        System.out.println("Data: " + data);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("Status: " + statusEmprestimo);

    }

    public void statusEndereco() {
        System.out.println("------ENDEREÇO------");
        System.out.println("Código: " + idEndereco);
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("numero: " + numero);
        System.out.println("cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }

    public void statusObras() {
        System.out.println("------OBRAS------");
        System.out.println("Código: " + idObras);
        System.out.println("Titulo: " + titulo);
        System.out.println("isbn: " + isbn);
        System.out.println("Ano da Publicação: " + anoPublicacao);
        System.out.println("Idioma: " + idioma);
        System.out.println("Area: " + area);
        System.out.println("Assunto: " + assunto);
    }

    public void statusTipo() {
        System.out.println("------TIPO------");
        System.out.println("Código: " + idTipo);
        System.out.println("Nome: " + nomeTipo);
    }

    public void statusAutor() {
        System.out.println("------AUTOR------");
        System.out.println("Nome: " + nomeAutor);
        System.out.println("Código: " + idAutor);
        System.out.println("CPF: " + cpfAutor);
        System.out.println("Último nome: " + ultimoNome);
        System.out.println("Titulação: "+titulacao);

    }

    public Biblioteca(int idAluno, String nomeAluno, String cpfAluno, String matriculaAluno, int idEmprestimo, Date data, Date dataDevolucao, String statusEmprestimo, int idEndereco, String rua, String numero, String bairro, String cidade, String estado, int idObras, String titulo, String isbn, int anoPublicacao, String idioma, String area, String assunto, int idTipo, String nomeTipo, int idAutor, String nomeAutor, String cpfAutor, String ultimoNome, String titulacao) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.matriculaAluno = matriculaAluno;
        this.idEmprestimo = idEmprestimo;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
        this.statusEmprestimo = statusEmprestimo;
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.idObras = idObras;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.idioma = idioma;
        this.area = area;
        this.assunto = assunto;
        this.idTipo = idTipo;
        this.nomeTipo = nomeTipo;
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.cpfAutor = cpfAutor;
        this.ultimoNome = ultimoNome;
        this.titulacao = titulacao;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdObras() {
        return idObras;
    }

    public void setIdObras(int idObras) {
        this.idObras = idObras;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
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

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
