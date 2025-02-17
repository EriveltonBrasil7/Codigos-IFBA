package model;

import java.util.Date;

public class Testes {
    public static void main(String[] args) {
        //CADASTRO DE ALUNO
        //Instanciando (alocando) um aluno na memória
        Aluno aluno1 = new Aluno();
        //inserindo dados no objeto
        aluno1.setNome("Eliomar");
        aluno1.setCpf("000.111.555-44");
        aluno1.setRg("2089230 ssp/al");
               
        //listando valores do objeto
        System.out.println("ALUNO 1:");
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("CPF: "+aluno1.getCpf());
        System.out.println("RG: "+aluno1.getRg());
        
        //cadastrando aluno2
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Rafaela");
        aluno2.setCpf("111.222.222-11");
        aluno2.setRg("25485 ssp/ba");
        
        //listando valores do objeto
        System.out.println("ALUNO 2:");
        System.out.println("Nome: "+aluno2.getNome());
        System.out.println("CPF: "+aluno2.getCpf());
        System.out.println("RG: "+aluno2.getRg());
        
        //Cadastrando livro
        Livro livro1 = new Livro();
        livro1.setAno("2012");
        livro1.setEdicao("1ª Edição");
        livro1.setNome("Java Como programar");
        //Cadastrando Livro com métodos construtores
        Livro livro2 = new Livro("2010", "UML", "2ª");
        Livro livro3 = new Livro("3ª Edição", "Modelagem");
        
        //Cadastrando Funcionario
        Funcionario fun1 = new Funcionario();
        fun1.setCpf("00000000");
        fun1.setDataAdmissao(new Date());
        fun1.setEndereco("Rua Barcelona 30 A BNH");
        fun1.setNome("Thays");
        fun1.setSalario(3.500);
        fun1.setNumCtps("4564787");
        fun1.setRg("456461");
        
        //Cadastrando emprestimo
        Emprestimo emp1 = new Emprestimo();
        emp1.setData(new Date());
        emp1.setAluno(aluno1);
        emp1.setLivro(livro1); 
        emp1.setFuncionario(fun1);
        
        //exibindo valores do emprestimo
        System.out.println("Emprestimo 1: ");
        System.out.println("Data: "+emp1.getData());
        System.out.println("Nome do Aluno "+emp1.getAluno().getNome());
        System.out.println("Nome do Livro: "+emp1.getLivro().getNome());
        System.out.println("Nome Funcionario: "+emp1.getFuncionario().getNome());
    }
}
