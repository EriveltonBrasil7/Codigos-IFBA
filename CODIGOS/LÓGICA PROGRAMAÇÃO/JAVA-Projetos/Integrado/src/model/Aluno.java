package model;

public class Aluno extends Pessoa{
    //atributos
    private String matricula;
    private String turma;

    public Aluno() {
    }

    public Aluno(String matricula, String turma) {
        super();
        this.matricula = matricula;
        this.turma = turma;    
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    
}
