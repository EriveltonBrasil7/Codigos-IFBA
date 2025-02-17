package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cargo;

public class DAOCargo {
   
   //método construtor vazio
   public DAOCargo(){
       if(ConexaoMySql.getConnection() == null){
           ConexaoMySql.createConnection();
       }
   } 
   
   public boolean atualizarCargo(Cargo cargo){
       String sql = "UPDATE cargo SET nome='"+cargo.getNome()+"', descricao='"+cargo.getDescricao()+"', auxalimentacao="+cargo.getAuxAlimentacao()+" WHERE codigo="+cargo.getCodigo()+"";
       return ConexaoMySql.atualizar(sql);
   }
   
   public boolean salvarCargo(Cargo cargo){
       String sql = "INSERT INTO cargo (nome, descricao, auxalimentacao) VALUES ('"+cargo.getNome()+"', '"+cargo.getDescricao()+"', "+cargo.getAuxAlimentacao()+")";
       return ConexaoMySql.atualizar(sql); 
   }
   
   public boolean deletarCargo(int id){ 
      String sql = "DELETE FROM cargo WHERE codigo="+id;
      boolean status = ConexaoMySql.atualizar(sql);
      return status;
   }

    public List<Cargo> getCargos(){   
        //Preenche um resultset com os dados do banco
        ConexaoMySql.selecionar("SELECT * FROM cargo");
        List<Cargo> listaCargos = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){  
                Cargo cargo = new Cargo();
                cargo.setCodigo(ConexaoMySql.resultset.getInt("codigo")); 
                cargo.setNome(ConexaoMySql.resultset.getString("nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("descricao"));
                cargo.setAuxAlimentacao(ConexaoMySql.resultset.getDouble("auxalimentacao"));
                
                System.out.println("Nome"+cargo.getNome());
                
                listaCargos.add(cargo);         
            }           
        } catch (SQLException ex) {
            System.out.println("ERRO!");
        }
        
        return listaCargos;
    }
    
    
    
        
 
}
