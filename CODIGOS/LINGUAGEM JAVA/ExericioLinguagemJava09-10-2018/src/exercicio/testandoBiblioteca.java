package exercicio;

public class testandoBiblioteca {

    public static void main(String[] args) {
        Biblioteca aluno = new Biblioteca();
        aluno.setNomeAluno("Erivelton Brasil");
        aluno.setIdAluno(1);
        aluno.setCpfAluno("126.794.344-04");
        aluno.setMatriculaAluno("12398398194747");

        Biblioteca emprestimo = new Biblioteca();
        emprestimo.setIdEmprestimo(1);
        // emprestimo.setData("09/10/2018");
        //emprestimo.setDataDevolucao("25102018");
        emprestimo.setStatusEmprestimo("Ocupado");

        Biblioteca endereco = new Biblioteca();
        endereco.setIdEndereco(1);
        endereco.setRua("Adolfo Santos");
        endereco.setNumero("191");
        endereco.setBairro("Campo Grande");
        endereco.setCidade("Delmiro Gouveia");
        endereco.setEstado("Alagoas");
        
        Biblioteca obras = new Biblioteca();
        obras.setIdObras(1);
        obras.setTitulo("O Crepusculo");
        obras.setIsbn("nem sei");
        obras.setAnoPublicacao(1998);
        obras.setIdioma("Português");
        obras.setArea("xxxxxx");
        obras.setAssunto("Romance");
        
        Biblioteca tipos = new Biblioteca();
        tipos.setIdTipo(1);
        tipos.setNomeTipo("Cómedia");
        
        Biblioteca autor = new Biblioteca();
        autor.setIdAutor(1);
        autor.setNomeAutor("Karoline");
        autor.setCpfAutor("245.123.432-09");
        autor.setUltimoNome("Brasil");
        autor.setTitulacao("sei não");
        
        Biblioteca aluno2= new Biblioteca();
        aluno2.setNomeAluno("Ana Brasil");
        aluno2.setIdAluno(2);
        aluno2.setCpfAluno("326.794.344-04");
        aluno2.setMatriculaAluno("2343213417");
        
        aluno.statusAluno();
        aluno2.statusAluno();
        emprestimo.statusEmprestimo();
        endereco.statusEndereco();
        obras.statusObras();
        tipos.statusTipo();
        autor.statusAutor();

    }
}
