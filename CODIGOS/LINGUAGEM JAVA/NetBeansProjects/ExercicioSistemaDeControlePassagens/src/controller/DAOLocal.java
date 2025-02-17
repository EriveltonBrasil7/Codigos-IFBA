package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Local;

public class DAOLocal {

    public DAOLocal() {
        ConexaoMySql.createConnection();
    }
    
    public void insertLocal(Local loc){
      String sql = "INSERT INTO  local (nome_Local, taxaEmbar_Local) VALUES ('"+loc.getNome()+"', '"+loc.getTaxaEmbarque()+"');";
       ConexaoMySql.atualizar(sql);
  }

    public ArrayList<Local> getAllLocais() {
        String sql = "SELECT * FROM local";
        ConexaoMySql.selecionar(sql);
        ArrayList<Local> lista = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Local loc = new Local();
                loc.setId(ConexaoMySql.resultset.getInt("id_Local"));
                loc.setNome(ConexaoMySql.resultset.getString("nome_Local"));
                loc.setTaxaEmbarque(ConexaoMySql.resultset.getDouble("taxaEmbar_Local"));
                lista.add(loc);
            }

        } catch (Exception ex) {
            System.out.println("Erro ao percorrer o resultset");
            System.out.println("Código de erro" + ex.getMessage());
        }
        return lista;
    }
}
