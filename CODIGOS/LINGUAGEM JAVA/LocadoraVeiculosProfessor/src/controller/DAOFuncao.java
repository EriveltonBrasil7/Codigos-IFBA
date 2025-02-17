package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcao;

public class DAOFuncao {
    
    public DAOFuncao(){
        if(ConexaoMySql.getConnection() == null){
            ConexaoMySql.createConnection();
        }
    }
    
    
    public boolean atualizarFuncao(Funcao c){
        String sql = "UPDATE funcao SET funca_nome='"+c.getNome()+"' WHERE funca_id="+c.getId()+"";
        System.out.println(sql);
        return ConexaoMySql.atualizar(sql);
    }
    
    public boolean deletarFuncao(int id){
       String sql = "DELETE FROM funcao WHERE funca_id="+id;
       return ConexaoMySql.atualizar(sql);
    }
    
    public boolean insertFuncao(Funcao c){
       String sql = "INSERT INTO funcao (funca_nome) VALUES ('"+c.getNome()+"')";
       return ConexaoMySql.atualizar(sql);
    }
    
    public List<Funcao> getAllFuncoes(String ordenacao){
        String sql = "SELECT * FROM funcao ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Funcao> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Funcao c = new Funcao();
                c.setId(ConexaoMySql.resultset.getInt("funca_id"));
                c.setNome(ConexaoMySql.resultset.getString("funca_nome"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllFuncoes");
        }
        
        return lista;
    }
    
    
    public List<Funcao> getFiltrarFuncoes(String campo, String valor, String ordenacao){
        String sql = "SELECT * FROM funcao WHERE "+campo+" LIKE '%"+valor+"%' ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Funcao> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Funcao c = new Funcao();
                c.setId(ConexaoMySql.resultset.getInt("funca_id"));
                c.setNome(ConexaoMySql.resultset.getString("funca_nome"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllFuncoes");
        }
        
        return lista;
    }

}
