package model;

public class Aluno extends Pessoa{
    private String matricula;
    private Endereco endCobranca;
    private Endereco endResidencial;

    public Aluno() {
    }

    public Aluno(String matricula, Endereco endCobranca, Endereco endResidencial, int id, String nome, String cpf) {
        super(id, nome, cpf);
        this.matricula = matricula;
        this.endCobranca = endCobranca;
        this.endResidencial = endResidencial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndCobranca() {
        return endCobranca;
    }

    public void setEndCobranca(Endereco endCobranca) {
        this.endCobranca = endCobranca;
    }

    public Endereco getEndResidencial() {
        return endResidencial;
    }

    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }

   
    
}
