package model;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private int id;
    private Date data;
    private Date dataDevolucao;
    private String status;
    private Aluno aluno;
    private ArrayList<Obra> obras;

    public Emprestimo() {
    }

    public Emprestimo(int id, Date data, Date dataDevolucao, String status, Aluno aluno, ArrayList<Obra> obras) {
        this.id = id;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.aluno = aluno;
        this.obras = obras;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
