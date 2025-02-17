package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cargo;
import model.Funcionario;

public class DAOFuncionario {
   
   //método construtor vazio
   public DAOFuncionario(){
       if(ConexaoMySql.getConnection() == null){
           ConexaoMySql.createConnection();
       }
   } 
   
   public boolean atualizarFuncionario(Funcionario funcionario){
       String sql = "UPDATE funcionario SET funci_nome='"+funcionario.getNome()+"', funci_cpf='"+funcionario.getCpf()+"', funci_sexo='"+funcionario.getSexo()+"', cargo_id="+funcionario.getCargo().getCodigo()+" WHERE funci_id="+funcionario.getCodigo()+"";
       return ConexaoMySql.atualizar(sql);
   }
   
   public boolean salvarFuncionario(Funcionario funcionario){
       String sql = "INSERT INTO funcionario (funci_nome, funci_cpf, funci_sexo, cargo_id) VALUES ('"+funcionario.getNome()+"', '"+funcionario.getCpf()+"', '"+funcionario.getSexo()+"', "+funcionario.getCargo().getCodigo()+")";
       return ConexaoMySql.atualizar(sql); 
   }
   
   public boolean deletarFuncionario(int id){ 
      String sql = "DELETE FROM funcionario WHERE funci_id="+id;
      boolean status = ConexaoMySql.atualizar(sql);
      return status;
   }

    public List<Funcionario> getFuncionarios(String colunaOrderBy){   
        //Preenche um resultset com os dados do banco
        ConexaoMySql.selecionar("SELECT * FROM funcionario, cargo WHERE funcionario.cargo_id = cargo.cargo_id ORDER BY "+colunaOrderBy);
        
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){  
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(ConexaoMySql.resultset.getInt("funci_id")); 
                funcionario.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                funcionario.setCpf(ConexaoMySql.resultset.getString("funci_cpf"));
                funcionario.setSexo(ConexaoMySql.resultset.getString("funci_sexo"));
                
                Cargo cargo = new Cargo();
                cargo.setCodigo(ConexaoMySql.resultset.getInt("cargo_id")); 
                cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                cargo.setAuxAlimentacao(ConexaoMySql.resultset.getDouble("cargo_auxalimentacao"));
                cargo.setTipo(ConexaoMySql.resultset.getString("cargo_tipo"));
                cargo.setPreco(ConexaoMySql.resultset.getDouble("cargo_preco"));
                
                funcionario.setCargo(cargo);
                
                listaFuncionarios.add(funcionario);         
            }           
        } catch (SQLException ex) {
            System.out.println("ERRO!");
        }
        
        return listaFuncionarios;
    }
    
    
    
     public List<Funcionario> getFiltrarFuncionarios(String colunaOrderBy, String colunaFiltro, String valor){   
        //Preenche um resultset com os dados do banco
        ConexaoMySql.selecionar("SELECT * FROM funcionario, cargo WHERE funcionario.cargo_id = cargo.cargo_id AND "+colunaFiltro+" LIKE '%"+valor+"%' ORDER BY "+colunaOrderBy);
        
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){  
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(ConexaoMySql.resultset.getInt("funci_id")); 
                funcionario.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                funcionario.setCpf(ConexaoMySql.resultset.getString("funci_cpf"));
                funcionario.setSexo(ConexaoMySql.resultset.getString("funci_sexo"));
                
                Cargo cargo = new Cargo();
                cargo.setCodigo(ConexaoMySql.resultset.getInt("cargo_id")); 
                cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                cargo.setAuxAlimentacao(ConexaoMySql.resultset.getDouble("cargo_auxalimentacao"));
                cargo.setTipo(ConexaoMySql.resultset.getString("cargo_tipo"));
                cargo.setPreco(ConexaoMySql.resultset.getDouble("cargo_preco"));
                
                funcionario.setCargo(cargo);
                
                listaFuncionarios.add(funcionario);       
            }           
        } catch (SQLException ex) {
            System.out.println("ERRO!");
        }
        
        return listaFuncionarios;
    }
    
        
 
}
