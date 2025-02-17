package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cargo;

public class DAOCargo {
    
    public DAOCargo(){
        if(ConexaoMySql.getConnection() == null){
            ConexaoMySql.createConnection();
        }
    }
    
    
    public boolean atualizarCargo(Cargo c){
        String sql = "UPDATE cargo SET cargo_nome='"+c.getNome()+"', cargo_descricao='"+c.getDescricao()+"', cargo_remuneracao='"+c.getRemuneracao()+"' WHERE cargo_id="+c.getId()+"";
        System.out.println(sql);
        return ConexaoMySql.atualizar(sql);
    }
    
    public boolean deletarCargo(int id){
       String sql = "DELETE FROM cargo WHERE cargo_id="+id;
       return ConexaoMySql.atualizar(sql);
    }
    
    public boolean insertCargo(Cargo c){
       String sql = "INSERT INTO cargo (cargo_nome, cargo_descricao, cargo_remuneracao) VALUES ('"+c.getNome()+"', '"+c.getDescricao()+"', '"+c.getRemuneracao()+"')";
       return ConexaoMySql.atualizar(sql);
    }
    
    public List<Cargo> getAllCargos(String ordenacao){
        String sql = "SELECT * FROM cargo ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Cargo> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Cargo c = new Cargo();
                c.setId(ConexaoMySql.resultset.getInt("cargo_id"));
                c.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                c.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                c.setRemuneracao(ConexaoMySql.resultset.getDouble("cargo_remuneracao"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllCargos");
        }
        
        return lista;
    }
    
    
    public List<Cargo> getFiltrarCargos(String campo, String valor, String ordenacao){
        String sql = "SELECT * FROM cargo WHERE "+campo+" LIKE '%"+valor+"%' ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Cargo> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Cargo c = new Cargo();
                c.setId(ConexaoMySql.resultset.getInt("cargo_id"));
                c.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                c.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                c.setRemuneracao(ConexaoMySql.resultset.getDouble("cargo_remuneracao"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllCargos");
        }
        
        return lista;
    }

}
