
package basicas;

public class Aluno extends Pessoa {
    private String matricula;
    private Endereco endCobranca;
    private Endereco endResidendical;

    public Aluno() {
    }

    public Aluno(String matricula, Endereco endCobranca, Endereco endResidendical, int id, String nome, String cpf) {
        super(id, nome, cpf);
        this.matricula = matricula;
        this.endCobranca = endCobranca;
        this.endResidendical = endResidendical;
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

    public Endereco getEndResidendical() {
        return endResidendical;
    }

    public void setEndResidendical(Endereco endResidendical) {
        this.endResidendical = endResidendical;
    }

    
    
}

