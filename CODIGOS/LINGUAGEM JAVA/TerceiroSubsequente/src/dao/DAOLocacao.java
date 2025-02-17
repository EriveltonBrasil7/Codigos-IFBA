package dao;

import basicas.Locacao;
import basicas.Veiculo;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOLocacao {
    
    public DAOLocacao(){
        if(ConexaoMySql.getConnection() == null){
            ConexaoMySql.createConnection();
        }      
    }
    
    public boolean atualizarLocacao(Locacao locacao){
      //String sql = "UPDATE locacao SET locacao_nome='"+locacao.getNome()+"', locacao_marca='"+locacao.getMarca()+"', locacao_modelo='"+locacao.getModelo()+"', locacao_placa='"+locacao.getPlaca()+"', locacao_cor='"+locacao.getCor()+"', locacao_ano='"+locacao.getAno()+"' WHERE locacao_id='"+locacao.getId()+"'";
       return ConexaoMySql.atualizar("");  
    }
    public boolean inserirLocacao(Locacao locacao){
        
        //INSERT INTO locacao (locac_dataentrega, locac_datadevolucao, locac_status, veiculo_id) VALUES ('2018-10-20 20:00:00', '2018-10-21 20:00:00', 'Encerrada', '8');
        //String sql = "INSERT INTO locacao (locacao_nome, locacao_marca, locacao_modelo, locacao_placa, locacao_cor, locacao_ano) "
         //       + "VALUES ('"+locacao.getNome()+"', '"+locacao.getMarca()+"', '"+locacao.getModelo()+"', '"+locacao.getPlaca()+"', '"+locacao.getCor()+"', '"+locacao.getAno()+"');";
        return ConexaoMySql.atualizar("");    
    }
    
    public ArrayList<Locacao> filtrarLocacaos(String coluna, String valor, String ordena){
//       String sql = "SELECT * FROM locacao WHERE "+coluna+" LIKE '%"+valor+"%' ORDER BY "+ordena;
//       ConexaoMySql.selecionar(sql);
       ArrayList<Locacao> listaLocacaos = new ArrayList<>();
//        try {
//            while(ConexaoMySql.resultset.next()){
//                Locacao loca = new Locacao();
//                loca.setId(ConexaoMySql.resultset.getInt("locacao_id"));
//                loca.setAno(ConexaoMySql.resultset.getString("locacao_ano"));
//                loca.setModelo(ConexaoMySql.resultset.getString("locacao_modelo"));
//                loca.setMarca(ConexaoMySql.resultset.getString("locacao_marca"));
//                loca.setCor(ConexaoMySql.resultset.getString("locacao_cor"));
//                loca.setNome(ConexaoMySql.resultset.getString("locacao_nome"));
//                loca.setPlaca(ConexaoMySql.resultset.getString("locacao_placa"));
//                
//                listaLocacaos.add(loca);
//            }
//        } catch (SQLException ex) {
//            System.out.println("algo errado não está serto");
//        }
         return listaLocacaos;
    }
    
    public boolean deletarLocacao(Locacao locacao){
       return ConexaoMySql.atualizar("DELETE FROM locacao WHERE locacao_id = "+locacao.getId());
    }
    
    public ArrayList<Locacao> getAllLocacoes(String ordena) {
        ConexaoMySql.selecionar("SELECT * "+
                                "FROM locacao l, veiculo v " +
                                "WHERE l.veiculo_id = v.veiculo_id "+
                                "ORDER BY "+ordena);
        ArrayList<Locacao> listaLocacoes = new ArrayList<>();
        try {
            while(ConexaoMySql.resultset.next()){
                Locacao loca = new Locacao();
                loca.setId(ConexaoMySql.resultset.getInt("locac_id"));
                loca.setDataDevolucao(ConexaoMySql.resultset.getDate("locac_datadevolucao"));
                loca.setDataEntrega(ConexaoMySql.resultset.getDate("locac_dataentrega"));
                loca.setStatus(ConexaoMySql.resultset.getString("locac_status"));
                
                Veiculo veiculo = new Veiculo();
                veiculo.setId(ConexaoMySql.resultset.getInt("veiculo_id")); 
                veiculo.setAno(ConexaoMySql.resultset.getString("veiculo_ano"));
                veiculo.setCor(ConexaoMySql.resultset.getString("veiculo_cor"));
                veiculo.setMarca(ConexaoMySql.resultset.getString("veiculo_marca"));
                veiculo.setModelo(ConexaoMySql.resultset.getString("veiculo_modelo"));
                veiculo.setNome(ConexaoMySql.resultset.getString("veiculo_nome"));
                veiculo.setPlaca(ConexaoMySql.resultset.getString("veiculo_placa"));
                
                loca.setVeiculo(veiculo); 
                
                listaLocacoes.add(loca);
            }
        } catch (SQLException ex) {
            System.out.println("algo errado não está serto");
        }
         return listaLocacoes;
    }
}
