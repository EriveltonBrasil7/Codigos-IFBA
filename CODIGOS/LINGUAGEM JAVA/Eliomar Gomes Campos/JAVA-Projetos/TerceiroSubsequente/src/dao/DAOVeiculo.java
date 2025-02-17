package dao;

import basicas.Veiculo;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOVeiculo {
    
    public DAOVeiculo(){
        if(ConexaoMySql.getConnection() == null){
            ConexaoMySql.createConnection();
        }      
    }
    
    public boolean atualizarVeiculo(Veiculo veiculo){
       String sql = "UPDATE veiculo SET veiculo_nome='"+veiculo.getNome()+"', veiculo_marca='"+veiculo.getMarca()+"', veiculo_modelo='"+veiculo.getModelo()+"', veiculo_placa='"+veiculo.getPlaca()+"', veiculo_cor='"+veiculo.getCor()+"', veiculo_ano='"+veiculo.getAno()+"' WHERE veiculo_id='"+veiculo.getId()+"'";
       return ConexaoMySql.atualizar(sql);  
    }
    public boolean inserirVeiculo(Veiculo veiculo){
        String sql = "INSERT INTO veiculo (veiculo_nome, veiculo_marca, veiculo_modelo, veiculo_placa, veiculo_cor, veiculo_ano) "
                + "VALUES ('"+veiculo.getNome()+"', '"+veiculo.getMarca()+"', '"+veiculo.getModelo()+"', '"+veiculo.getPlaca()+"', '"+veiculo.getCor()+"', '"+veiculo.getAno()+"');";
        return ConexaoMySql.atualizar(sql);    
    }
    
    public ArrayList<Veiculo> filtrarVeiculos(String coluna, String valor, String ordena){
       String sql = "SELECT * FROM veiculo WHERE "+coluna+" LIKE '%"+valor+"%' ORDER BY "+ordena;
       ConexaoMySql.selecionar(sql);
       ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        try {
            while(ConexaoMySql.resultset.next()){
                Veiculo vei = new Veiculo();
                vei.setId(ConexaoMySql.resultset.getInt("veiculo_id"));
                vei.setAno(ConexaoMySql.resultset.getString("veiculo_ano"));
                vei.setModelo(ConexaoMySql.resultset.getString("veiculo_modelo"));
                vei.setMarca(ConexaoMySql.resultset.getString("veiculo_marca"));
                vei.setCor(ConexaoMySql.resultset.getString("veiculo_cor"));
                vei.setNome(ConexaoMySql.resultset.getString("veiculo_nome"));
                vei.setPlaca(ConexaoMySql.resultset.getString("veiculo_placa"));
                
                listaVeiculos.add(vei);
            }
        } catch (SQLException ex) {
            System.out.println("algo errado não está serto");
        }
         return listaVeiculos;
    }
    
    public boolean deletarVeiculo(Veiculo veiculo){
       return ConexaoMySql.atualizar("DELETE FROM veiculo WHERE veiculo_id = "+veiculo.getId());
    }
    
    public ArrayList<Veiculo> getAllVeiculos(String ordena) {
        ConexaoMySql.selecionar("SELECT * FROM veiculo ORDER BY "+ordena);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        try {
            while(ConexaoMySql.resultset.next()){
                Veiculo vei = new Veiculo();
                vei.setId(ConexaoMySql.resultset.getInt("veiculo_id"));
                vei.setAno(ConexaoMySql.resultset.getString("veiculo_ano"));
                vei.setModelo(ConexaoMySql.resultset.getString("veiculo_modelo"));
                vei.setMarca(ConexaoMySql.resultset.getString("veiculo_marca"));
                vei.setCor(ConexaoMySql.resultset.getString("veiculo_cor"));
                vei.setNome(ConexaoMySql.resultset.getString("veiculo_nome"));
                vei.setPlaca(ConexaoMySql.resultset.getString("veiculo_placa"));
                
                listaVeiculos.add(vei);
            }
        } catch (SQLException ex) {
            System.out.println("algo errado não está serto");
        }
         return listaVeiculos;
    }
}
