package testes;

import model.Aluno;
import model.Autor;
import model.Emprestimo;
import model.Endereco;
import model.Obra;
import model.Tipo;
import java.util.ArrayList;

public class CadastroEmprestimo {
    public static void main(String[] args) {
        Endereco end1 = new Endereco();
        end1.setId(1);
        end1.setRua("Barcelona"); 
        end1.setNumero("30A"); 
        end1.setBairro("BNH");
        end1.setCidade("Paulo Afonso");
        end1.setEstado("Bahia"); 
        
        
        Aluno aluno1 = new Aluno();
        aluno1.setId(1); 
        aluno1.setNome("Eliomar Campos"); 
        aluno1.setCpf("555.444.777-47");
        aluno1.setMatricula("20180001");
        aluno1.setEndCobranca(end1); 
        aluno1.setEndResidencial(end1); 
        
        
        Autor autor1 = new Autor();
        autor1.setId(1);
        autor1.setNome("James"); 
        autor1.setCpf("000.111.222-11"); 
        autor1.setUltimoNome("Bond"); 
        autor1.setTitulacao("MsC"); 
        
        Autor autor2 = new Autor();
        autor2.setId(2);
        autor2.setNome("Bill"); 
        autor2.setCpf("111.444.225-44"); 
        autor2.setUltimoNome("Gates");  
        autor2.setTitulacao("PhD"); 
        
        
        Obra obra1 = new Obra();
        obra1.setId(1); 
        obra1.setTitulo("O futuro");
        obra1.setIsbn("45612"); 
        obra1.setAnoPublicacao("1995");
        obra1.setIdioma("Inglês");
        obra1.setArea("Computação");
        obra1.setAssunto("Auto Ajuda");
        obra1.setAutor(autor1); 
        
        Obra obra2 = new Obra();
        obra2.setId(2); 
        obra2.setTitulo("Java OO");
        obra2.setIsbn("13478"); 
        obra2.setAnoPublicacao("2017");
        obra2.setIdioma("Português");
        obra2.setArea("Computação");
        obra2.setAssunto("Programação");
        obra2.setAutor(autor2); 
        
        Obra obra3 = new Obra();
        obra3.setId(3); 
        obra3.setTitulo("C#");
        obra3.setIsbn("5447"); 
        obra3.setAnoPublicacao("2017");
        obra3.setIdioma("Português");
        obra3.setArea("Computação");
        obra3.setAssunto("Programação");
        obra3.setAutor(autor2); 
        
        ArrayList<Obra> listaDeObras = new ArrayList<>();
        listaDeObras.add(obra1);
        listaDeObras.add(obra2); 
        
        Emprestimo emp1 = new Emprestimo();
        emp1.setId(1);
        emp1.setData(null); 
        emp1.setDataDevolucao(null); 
        emp1.setStatus("Emprestado"); 
        emp1.setAluno(aluno1); 
        emp1.setObras(listaDeObras); 
        
        Tipo tipo1 = new Tipo();
        tipo1.setId(1);
        tipo1.setNome("Livro");
        obra1.setTipo(tipo1);
        obra2.setTipo(tipo1);
        obra3.setTipo(tipo1); 
        
        
        System.out.println("******** RECIBO DE EMPRESTIMO ******");
        System.out.println("Código: "+emp1.getId());
        System.out.println("Data: "+emp1.getData()); 
        System.out.println("Data Devolução: "+emp1.getDataDevolucao());
        System.out.println("Nome Aluno: "+emp1.getAluno().getNome()); 
        System.out.println("Rua Aluno: "+emp1.getAluno().getEndResidencial().getRua());
        System.out.println("******* OBRAS EMPRESTADAS ******");
        
        for(Obra obra : emp1.getObras()){
            System.out.println("Código: "+obra.getId()); 
            System.out.println("Título: "+obra.getTitulo());
            System.out.println("Autor: "+obra.getAutor().getNome());
            System.out.println("Tipo: "+obra.getTipo().getNome()); 
        }
        
        for(int i=0; i <  emp1.getObras().size(); i++){
            System.out.println("Código: "+emp1.getObras().get(i).getId());  
            System.out.println("Título: "+emp1.getObras().get(i).getTitulo());
            System.out.println("Autor: "+emp1.getObras().get(i).getAutor().getNome());
            System.out.println("Tipo: "+emp1.getObras().get(i).getTipo().getNome());
        }
        
    }
}
