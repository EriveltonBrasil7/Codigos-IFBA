package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Endereco;

/**
 *
 * @author eliomar.campos
 */
public class DAOEndereco {
    
    public DAOEndereco(){
        ConexaoMySql.createConnection();
    }
    
    public void insertEndereco(Endereco ender){
        String sql = "INSERT INTO endereco (ender_rua, ender_numero, ender_bairro, ender_cidade, ender_estado) VALUES ('"+ender.getRua()+"', '"+ender.getNumero()+"', '"+ender.getBairro()+"', '"+ender.getCidade()+"', '"+ender.getEstado()+"')";
        ConexaoMySql.atualizar(sql);
    }
    
    public ArrayList<Endereco> getAllEnderecos(){
        String sql = "SELECT * FROM endereco";
        ConexaoMySql.selecionar(sql); 
        ArrayList<Endereco> lista = new ArrayList<>();
        
        try {
            while(ConexaoMySql.resultset.next()){
                Endereco end = new Endereco();
                end.setId(ConexaoMySql.resultset.getInt("ender_id")); 
                end.setBairro(ConexaoMySql.resultset.getString("ender_bairro"));
                end.setCidade(ConexaoMySql.resultset.getString("ender_cidade"));
                end.setEstado(ConexaoMySql.resultset.getString("ender_estado"));
                end.setNumero(ConexaoMySql.resultset.getString("ender_numero")); 
                end.setRua(ConexaoMySql.resultset.getString("ender_rua")); 
                lista.add(end);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao percorrer o resultset");
            System.out.println("Código do erro: "+ex.getMessage());
        }
        
        return lista;
    }
}
