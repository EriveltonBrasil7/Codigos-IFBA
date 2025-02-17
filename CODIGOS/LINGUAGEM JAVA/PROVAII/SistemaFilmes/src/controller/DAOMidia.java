package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Midia;

public class DAOMidia {

    public DAOMidia() {
        ConexaoMySql.createConnection();
    }
    
    public void insertMidia(Midia mid){
       String sql = "INSERT INTO midia (codBarra_Midia, status_Midia) VALUES ('"+mid.getCodBarra()+"', '"+mid.getStatus()+"');";
       ConexaoMySql.atualizar(sql);
  }

    public ArrayList<Midia> getAllMidias() {
        String sql = "SELECT * FROM midia";
        ConexaoMySql.selecionar(sql);
        ArrayList<Midia> lista = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Midia mid = new Midia();
                mid.setId(ConexaoMySql.resultset.getInt("id_Midia"));
                mid.setCodBarra(ConexaoMySql.resultset.getString("codBarra_Midia"));
                mid.setStatus(ConexaoMySql.resultset.getString("status_Midia"));
                lista.add(mid);
            }

        } catch (Exception ex) {
            System.out.println("Erro ao percorrer o resultset");
            System.out.println("Código de erro" + ex.getMessage());
        }
        return lista;
    }
}