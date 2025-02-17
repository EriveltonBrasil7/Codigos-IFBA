
package basicas;

public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private String matricula;
    private Endereco endCobranca;
    private Endereco endResidendical;

    public Aluno(int id, String nome, String cpf, String matricula, Endereco endCobranca, Endereco endResidendical) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endCobranca = endCobranca;
        this.endResidendical = endResidendical;
    }

    
    public Aluno(){
    }

    public Endereco getEndCobranca() {
        return endCobranca;
    }

    public void setEndCobranca(Endereco endCobranca) {
        this.endCobranca = endCobranca;
    }

    public Endereco getEndResidendical() {
        return endResidendical;
    }

    public void setEndResidendical(Endereco endResidendical) {
        this.endResidendical = endResidendical;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}

