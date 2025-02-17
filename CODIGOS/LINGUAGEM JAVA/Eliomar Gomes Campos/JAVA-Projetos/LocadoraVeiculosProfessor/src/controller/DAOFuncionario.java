package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class DAOFuncionario {
    
    public DAOFuncionario(){
        if(ConexaoMySql.getConnection() == null){
            ConexaoMySql.createConnection();
        }
    }
    
    
    public boolean atualizarFuncionario(Funcionario c){
        String sql = "UPDATE funcionario SET funci_nome='"+c.getNome()+"' WHERE funci_id="+c.getId()+"";
        System.out.println(sql);
        return ConexaoMySql.atualizar(sql);
    }
    
    public boolean deletarFuncionario(int id){
       String sql = "DELETE FROM funcionario WHERE funci_id="+id;
       return ConexaoMySql.atualizar(sql);
    }
    
    public boolean insertFuncionario(Funcionario c){
       String sql = "INSERT INTO funcionario (funci_nome) VALUES ('"+c.getNome()+"')";
       return ConexaoMySql.atualizar(sql);
    }
    
    public List<Funcionario> getAllFuncionarios(String ordenacao){
        String sql = "SELECT * FROM funcionario ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Funcionario> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Funcionario c = new Funcionario();
                c.setId(ConexaoMySql.resultset.getInt("funci_id"));
                c.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllFuncionarios");
        }
        
        return lista;
    }
    
    
    public List<Funcionario> getFiltrarFuncionarios(String campo, String valor, String ordenacao){
        String sql = "SELECT * FROM funcionario WHERE "+campo+" LIKE '%"+valor+"%' ORDER BY "+ordenacao;
        ConexaoMySql.selecionar(sql);
        
        List<Funcionario> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Funcionario c = new Funcionario();
                c.setId(ConexaoMySql.resultset.getInt("funci_id"));
                c.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método getAllFuncionarios");
        }
        
        return lista;
    }

}
