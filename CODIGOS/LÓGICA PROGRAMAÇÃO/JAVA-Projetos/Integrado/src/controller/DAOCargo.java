package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cargo;

public class DAOCargo {
   
   //método construtor vazio
   public DAOCargo(){
       if(ConexaoMySql.getConnection() == null){
           ConexaoMySql.createConnection();
       }
   } 
   
   public boolean atualizarCargo(Cargo cargo){
       String sql = "UPDATE cargo SET cargo_nome='"+cargo.getNome()+"', cargo_descricao='"+cargo.getDescricao()+"', cargo_auxalimentacao="+cargo.getAuxAlimentacao()+", cargo_tipo='"+cargo.getTipo()+"', cargo_preco="+cargo.getPreco()+" WHERE cargo_id="+cargo.getCodigo()+"";
       return ConexaoMySql.atualizar(sql);
   }
   
   public boolean salvarCargo(Cargo cargo){
       String sql = "INSERT INTO cargo (cargo_nome, cargo_descricao, cargo_auxalimentacao, cargo_tipo, cargo_preco) VALUES ('"+cargo.getNome()+"', '"+cargo.getDescricao()+"', "+cargo.getAuxAlimentacao()+",'"+cargo.getTipo()+"', "+cargo.getPreco()+")";
       return ConexaoMySql.atualizar(sql); 
   }
   
   public boolean deletarCargo(int id){ 
      String sql = "DELETE FROM cargo WHERE cargo_id="+id;
      boolean status = ConexaoMySql.atualizar(sql);
      return status;
   }

    public List<Cargo> getCargos(String colunaOrderBy){   
        //Preenche um resultset com os dados do banco
        ConexaoMySql.selecionar("SELECT * FROM cargo ORDER BY "+colunaOrderBy);
        
        List<Cargo> listaCargos = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){  
                Cargo cargo = new Cargo();
                cargo.setCodigo(ConexaoMySql.resultset.getInt("cargo_id")); 
                cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                cargo.setAuxAlimentacao(ConexaoMySql.resultset.getDouble("cargo_auxalimentacao"));
                cargo.setTipo(ConexaoMySql.resultset.getString("cargo_tipo"));
                cargo.setPreco(ConexaoMySql.resultset.getDouble("cargo_preco"));
                
                listaCargos.add(cargo);         
            }           
        } catch (SQLException ex) {
            System.out.println("ERRO!");
        }
        
        return listaCargos;
    }
    
    
    
     public List<Cargo> getFiltrarCargos(String colunaOrderBy, String colunaFiltro, String valor){   
        //Preenche um resultset com os dados do banco
        ConexaoMySql.selecionar("SELECT * FROM cargo WHERE "+colunaFiltro+" LIKE '%"+valor+"%' ORDER BY "+colunaOrderBy);
        
        List<Cargo> listaCargos = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){  
                Cargo cargo = new Cargo();
                cargo.setCodigo(ConexaoMySql.resultset.getInt("cargo_id")); 
                cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                cargo.setAuxAlimentacao(ConexaoMySql.resultset.getDouble("cargo_auxalimentacao"));
                cargo.setTipo(ConexaoMySql.resultset.getString("cargo_tipo"));
                cargo.setPreco(ConexaoMySql.resultset.getDouble("cargo_preco"));
                
                listaCargos.add(cargo);         
            }           
        } catch (SQLException ex) {
            System.out.println("ERRO!");
        }
        
        return listaCargos;
    }
    
        
 
}
